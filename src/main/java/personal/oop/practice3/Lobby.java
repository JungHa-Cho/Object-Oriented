package personal.oop.practice3;

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
    public void ReadyForBattle() {

        for (int i = 1; i <= playerCount; i++) {
            players.add(new Player("guest" + i));
//            players.add(new Player().setName("guest" + i));
        }

    }

    /**
     * 전투장으로 이동
     */
    public void goToBattleGround(BattleGround map) {
        map.enterToBattleGround(players);
    }

}
