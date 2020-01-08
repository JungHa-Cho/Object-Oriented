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

            int rock = 0;
            int paper = 0;
            int scissors = 0;

            for (Player player : players) {
                player.selectWeapon(player);
            }

            System.out.println("안내면 진다 가위바위보!");

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
                exitBattleGrond(players, "PAPER");
            else if (paper == 0 && rock > 0 && scissors > 0)
                exitBattleGrond(players, "SCISSORS");
            else if (scissors == 0 && paper > 0 && rock > 0)
                exitBattleGrond(players, "ROCK");
            else
                System.out.println("무승부");

            if (players.size() == 1) {
                System.out.println("========================");
                System.out.println("게임종료");
                System.out.println(players.get(0).getName() + " WinnerWinner !");
                break;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void exitBattleGrond(List<Player> players, String weaponType) {

        weaponEnum = WeaponEnum.getWeaponEnum(weaponType);
        List<Player> loserPlayerList = new ArrayList<>();

        for (Player player : players) {
            if (player.getWeapon() == weaponEnum.getWeaponEnum(weaponType)) {
                loserPlayerList.add(player);
            }
        }

        for (Player loserPlayer : loserPlayerList) {
            System.out.println(loserPlayer.getName() + " Die..");
            players.remove(loserPlayer);
        }
    }

}
