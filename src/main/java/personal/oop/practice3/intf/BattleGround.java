package personal.oop.practice3.intf;

import personal.oop.practice3.Player;
import personal.oop.practice3.WeaponEnum;

import java.util.List;

public interface BattleGround {

    void enterToBattleGround(List<Player> players);

    void Battle(List<Player> players);

    void exitBattleGrond(List<Player> players, WeaponEnum weaponType);

}
