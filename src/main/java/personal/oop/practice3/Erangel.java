package personal.oop.practice3;

import personal.oop.practice3.intf.BattleGround;

import java.util.ArrayList;
import java.util.List;

public class Erangel implements BattleGround {

    private List<Player> players;
    private WeaponEnum weaponEnum;

    public Erangel() {
        this.players = new ArrayList<>();
    }

    @Override
    public void enterToBattleGround(List<Player> players) {

        System.out.println("에란겔 입장");

    }

    @Override
    public void Battle(List<Player> players) {

        while (true) {

            System.out.println("========================");

            for (Player player : players)
                player.selectWeapon(player);

            System.out.println("안내면 진다 가위바위보!");

            WeaponEnum loseType = shooting(players);

            if (loseType == null)
                System.out.println("멋진 승부였다. 무승부");
            else
                exitBattleGrond(players, loseType);

            if (players.size() == 1)
                break;

            sleep(1000);

        }

        System.out.println("========================");
        System.out.println("게임종료");
        System.out.println(players.get(0).getName() + " WinnerWinner !");

    }

    public WeaponEnum shooting(List<Player> players) {

        int rock = 0;
        int paper = 0;
        int scissors = 0;

        for (Player player : players) {
            switch (player.getWeapon()) {
                case ROCK:
                    rock++;
                    break;
                case PAPER:
                    paper++;
                    break;
                case SCISSORS:
                    scissors++;
                    break;
            }
        }

        if (rock == 0 && paper > 0 && scissors > 0)
            return WeaponEnum.PAPER;
        else if (paper == 0 && rock > 0 && scissors > 0)
            return WeaponEnum.SCISSORS;
        else if (scissors == 0 && paper > 0 && rock > 0)
            return WeaponEnum.ROCK;
        else
            return null;

    }

    @Override
    public void exitBattleGrond(List<Player> players, WeaponEnum weaponType) {

        List<Player> loserPlayerList = new ArrayList<>();

        for (Player player : players) {
            if (player.getWeapon() == weaponType) {
                loserPlayerList.add(player);
            }
        }

        for (Player loserPlayer : loserPlayerList) {
            System.out.println(loserPlayer.getName() + " Die..");
            players.remove(loserPlayer);
        }
    }

    public void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
