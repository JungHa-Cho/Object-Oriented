package personal.oop.practice3;

import java.util.List;

public class PlayGame {

    public void start() {

        // 플레이어 대기실 입장
        Lobby lobby = new Lobby(5);
        List<Player> readyCompletePlayer = lobby.readyForBattle();

        // 맵 선택
        Erangel map = new Erangel();

        // 배틀그라운드 입장
        List<Player> armedPlayer = lobby.goToBattleGround(map, readyCompletePlayer);
        map.Battle(armedPlayer);
    }
}
