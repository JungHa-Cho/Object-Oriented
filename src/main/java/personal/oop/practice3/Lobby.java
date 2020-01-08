package personal.oop.practice3;

import personal.oop.practice3.intf.BattleGround;

import java.util.ArrayList;
import java.util.List;

public class Lobby {

    private int playerCount;
    private List<Player> players;

    public Lobby(int playerCount) {

        this.playerCount = playerCount;
        this.players = new ArrayList<>();

    }

    /**
     * 플레이어 준비완료
     */
    public List<Player> readyForBattle() {

        for (int i = 1; i <= playerCount; i++) {
            players.add(new Player("guest" + i));
        }

        return players;

    }

    /**
     * 전투장으로 이동
     *
     * @return
     */
    public List<Player> goToBattleGround(BattleGround map, List<Player> players) {

        map.enterToBattleGround(players);
        return players;

    }

}
