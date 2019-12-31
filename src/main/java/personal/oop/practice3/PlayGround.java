package personal.oop.practice3;

import personal.oop.practice3.common.KoreanNameMaker;
import personal.oop.practice3.intf.Player;
import personal.oop.practice3.intf.RockPaperScissors;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cho_jeong_ha
 * @project oop-practice
 * @update 2019-12-30
 **/
public class PlayGround {

    private int playerCount;
    private List<Player> playerList;

    public PlayGround(int playerCount) {
        this.playerCount = playerCount;
        this.playerList = new ArrayList<>();
    }

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

    private void winnerWinnerChickenDinner() {
        int rockCount = 0;
        int paperCount = 0;
        int scissorsCount = 0;

        for (Player player : playerList) {
            RockPaperScissors rockPaperScissors = player.select();

            switch (rockPaperScissors) {
                case ROCK:
                    rockCount++;
                    break;
                case PAPER:
                    paperCount++;
                    break;
                case SCISSORS:
                    scissorsCount++;
                    break;
            }

            if (rockCount == 0 || paperCount == 0 || scissorsCount == 0) {
                if (rockCount == 0 && paperCount == 0) {
                    System.out.println("모두 비겼다.");
                } else if (rockCount == 0 && scissorsCount == 0) {
                    System.out.println("모두 비겼다.");
                } else {
                    break;
                }
            }
        }

        if (rockCount == 0) {

        } else if (paperCount == 0) {

        } else if (scissorsCount == 0) {

        }
    }
}
