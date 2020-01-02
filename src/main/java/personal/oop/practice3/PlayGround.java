package personal.oop.practice3;

import personal.oop.practice3.common.Counter;
import personal.oop.practice3.common.KoreanNameMaker;
import personal.oop.practice3.common.Verify;
import personal.oop.practice3.intf.RockPaperScissorsGamePlayer;
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
    private List<RockPaperScissorsGamePlayer> rockPaperScissorsGamePlayerList;

    /**
     * Instantiates a new Play ground.
     *
     * @param playerCount the player count
     */
    public PlayGround(int playerCount) {
        this.playerCount = playerCount;
        this.rockPaperScissorsGamePlayerList = new ArrayList<>();
    }

    /**
     * Start.
     */
    public void start() {
        KoreanNameMaker koreanNameMaker = new KoreanNameMaker();

        for (int i = 0; i < playerCount; i++)
            rockPaperScissorsGamePlayerList.add(new RockPaperScissorsGamePlayer(koreanNameMaker.getRandomName()));

        winnerWinnerChickenDinner();
    }

    // game calculate, main logic
    private void winnerWinnerChickenDinner() {
        while (true) {
            // 가위 바위 보 계수기
            Counter gameCounter = new Counter();

            // 실제 player가 가위 바위 보를 선택함
            for (RockPaperScissorsGamePlayer rockPaperScissorsGamePlayer : rockPaperScissorsGamePlayerList)
                gameCounter.calculate(rockPaperScissorsGamePlayer.select());

            // 진 사람 선별기
            Verify gameVerifier = new Verify(gameCounter);
            RockPaperScissors verifyRose = gameVerifier.verifyRose();

            // 진 사람이 있으면
            if (verifyRose != null) {
                deleteLoser(verifyRose);
            } else {
                System.out.println("진 사람이 없음!");
            }

            if (rockPaperScissorsGamePlayerList.size() == 1) {
                System.out.println("우승자 : " + rockPaperScissorsGamePlayerList.get(0).getName());
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

    private void deleteLoser(RockPaperScissors rockPaperScissors) {
        List<RockPaperScissorsGamePlayer> indexing = new ArrayList<>();
        for (RockPaperScissorsGamePlayer rockPaperScissorsGamePlayer : rockPaperScissorsGamePlayerList) {
            if (rockPaperScissorsGamePlayer.getRockPaperScissors() == rockPaperScissors)
                indexing.add(rockPaperScissorsGamePlayer);
        }

        for (RockPaperScissorsGamePlayer loser : indexing) {
            System.out.println("진사람 : " + loser.getName());
            rockPaperScissorsGamePlayerList.remove(loser);
        }
    }
}
