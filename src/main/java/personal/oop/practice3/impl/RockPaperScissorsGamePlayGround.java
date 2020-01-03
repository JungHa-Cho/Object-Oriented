package personal.oop.practice3.impl;

import personal.oop.practice3.abst.Game;
import personal.oop.practice3.abst.PlayGround;
import personal.oop.practice3.abst.Player;
import personal.oop.practice3.common.KoreanNameMaker;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Play ground.
 *
 * @author cho_jeong_ha
 * @project oop -practice
 * @update 2019 -12-30
 */
public class RockPaperScissorsGamePlayGround implements Game, PlayGround {

    private int playerCount;
    private List<RockPaperScissorsGamePlayer> rockPaperScissorsGamePlayerList;

    /**
     * Instantiates a new Play ground.
     *
     * @param playerCount the player count
     */
    public RockPaperScissorsGamePlayGround(int playerCount) {
        this.playerCount = playerCount;
        this.rockPaperScissorsGamePlayerList = new ArrayList<>();
    }

    @Override
    public void start() {
        KoreanNameMaker koreanNameMaker = new KoreanNameMaker();

        for (int i = 0; i < playerCount; i++)
            rockPaperScissorsGamePlayerList.add(new RockPaperScissorsGamePlayer(koreanNameMaker.getRandomName()));

        enter();
    }

    @Override
    public void enter() {
        for (Player player : rockPaperScissorsGamePlayerList)
            System.out.println(player.getName() + ", 가위바위보 게임에 참여했다.");
        System.out.println("============================");

        while (true) {
            RockPaperScissorsGameCounter rockPaperScissorsGameCounter = realPlay();
            RockPaperScissorsGameVerifier rockPaperScissorsGameVerifier = new RockPaperScissorsGameVerifier(rockPaperScissorsGameCounter);
            RockPaperScissorsEnum verifyRose = RockPaperScissorsEnum.fromName(rockPaperScissorsGameVerifier.verify());

            if (verifyRose != null)
                exitLoser(verifyRose);
            else
                System.out.println("비겼다!");

            if (rockPaperScissorsGamePlayerList.size() == 1)
                break;

            System.out.println("===========================================");
            sleep();
        }

        System.out.println("============================");
        System.out.println("우승자 : " + rockPaperScissorsGamePlayerList.get(0).getName());
        System.out.println("게임 끝!");
    }

    private void sleep() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private RockPaperScissorsGameCounter realPlay() {
        RockPaperScissorsGameCounter rockPaperScissorsGameCounter = new RockPaperScissorsGameCounter();
        for (int i = 0; i < rockPaperScissorsGamePlayerList.size(); i++) {
            rockPaperScissorsGamePlayerList.get(i).select();
            rockPaperScissorsGameCounter.calculate(rockPaperScissorsGamePlayerList.get(i).play());
        }
        return rockPaperScissorsGameCounter;
    }

    private void exitLoser(RockPaperScissorsEnum rockPaperScissorsEnum) {
        List<RockPaperScissorsGamePlayer> indexing = new ArrayList<>();
        for (RockPaperScissorsGamePlayer rockPaperScissorsGamePlayer : rockPaperScissorsGamePlayerList) {
            if (rockPaperScissorsGamePlayer.getRockPaperScissorsEnum() == rockPaperScissorsEnum)
                indexing.add(rockPaperScissorsGamePlayer);
        }

        for (RockPaperScissorsGamePlayer loser : indexing) {
            System.out.println("진사람은 퇴장합니다... : " + loser.getName());
            rockPaperScissorsGamePlayerList.remove(loser);
        }
    }
}
