package personal.oop.practice3;

import personal.oop.practice3.intf.Player;

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

        for (Player player : playerList)
            player.select();
    }
}
