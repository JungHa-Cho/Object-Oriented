package personal.oop.practice3;

public class PlayGame {

    public void start() {

        // 플레이어 대기실 입장
        Lobby lobby = new Lobby(5);
        lobby.ReadyForBattle();

        // 맵 랜덤 선택 기능
        //BattleGround map = new Erangel();

        // 배틀그라운드 입장
        lobby.goToBattleGround(new Erangel());

        // 각 플레이어들 가위 바위 보 선택
        //Player player = new Player();

    }
}
