package personal.oop.practice3;

import personal.oop.practice3.common.Counter;
import personal.oop.practice3.common.KoreanNameMaker;
import personal.oop.practice3.common.Verify;
import personal.oop.practice3.intf.Player;
import personal.oop.practice3.intf.RockPaperScissors;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Play ground.
 *
 * @author cho_jeong_ha
 * @project oop -practice
 * @update 2019 -12-30
 */
public class PlayGround {

    private int playerCount;
    private List<Player> playerList;

    /**
     * Instantiates a new Play ground.
     *
     * @param playerCount the player count
     */
    public PlayGround(int playerCount) {
        this.playerCount = playerCount;
        this.playerList = new ArrayList<>();
    }

    /**
     * Start.
     */
    public void start() {
        KoreanNameMaker koreanNameMaker = new KoreanNameMaker();

        for (int i = 0; i < playerCount; i++)
            playerList.add(new Player(koreanNameMaker.getRandomName()));

        winnerWinnerChickenDinner();
    }

    private void mindControl() {
        for (Player player : playerList)
            player.select();
    }

    // game calculate
    private void winnerWinnerChickenDinner() {
        while (true) {
            // 가위 바위 보 계수기
            Counter gameCounter = new Counter();

            // 실제 player가 가위 바위 보를 선택함
            for (Player player : playerList)
                gameCounter.calculate(player.select());

            // 진 사람 선별기
            Verify gameVerifier = new Verify(gameCounter);
            RockPaperScissors verifyRose = gameVerifier.verifyRose();

            // 진 사람이 있으면
            if (verifyRose != null) {
                deleteRoser(verifyRose);
            } else {
                System.out.println("진 사람이 없음!");
            }

            if (playerList.size() == 1) {
                System.out.println("우승자 : " + playerList.get(0).getName());
                System.out.println("게임 끝!");
                break;
            }

            System.out.println("===========================================");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void deleteRoser(RockPaperScissors rockPaperScissors) {
        List<Player> indexing = new ArrayList<>();
        for (Player player : playerList) {
            if (player.getRockPaperScissors() == rockPaperScissors)
                indexing.add(player);
        }

        for (Player roser : indexing) {
            System.out.println("진사람 : " + roser.getName());
            playerList.remove(roser);
        }
    }
}
