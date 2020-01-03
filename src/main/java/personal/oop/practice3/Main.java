package personal.oop.practice3;

import personal.oop.practice3.impl.RockPaperScissorsGamePlayGround;

/**
 * @author cho_jeong_ha
 * @project oop-practice
 * @update 2019-12-30
 **/
public class Main {
    public static void main(String[] args) {
        RockPaperScissorsGamePlayGround gameBoard = new RockPaperScissorsGamePlayGround(6);
        gameBoard.start();
    }
}
