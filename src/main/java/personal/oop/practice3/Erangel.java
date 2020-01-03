package personal.oop.practice3;

import java.util.ArrayList;
import java.util.List;

public class Erangel implements BattleGround {

    private List<Player> players;

    public Erangel() {
        this.players = new ArrayList<>();
    }

    @Override
    public void enterToBattleGround(List<Player> players) {
        for (Player player : players) {
            System.out.println(player.getName() + " 배틀그라운드 입장");
        }

    }

}
