package personal.oop.practice3;

import personal.oop.practice3.intf.PlayBehavior;

import java.util.Random;


public class Player implements PlayBehavior {

    private String name;

    private WeaponEnum weaponEnum;
    private WeaponEnum weapon;

    public Player(String name) {
        this.name = name;
    }

    /**
     * 무기를 선택한다.
     *
     * @param player
     */
    @Override
    public void selectWeapon(Player player) {
        setWeapon(weaponEnum.values()[getRandom()]);
        System.out.println(player.getName() + "가 " + player.getWeapon() + "을(를) 선택했다.");
    }

    /**
     * 감정표현한다.
     *
     * @param player
     */
    @Override
    public void emote(Player player) {

    }

    private int getRandom() {
        return new Random().nextInt(3);
    }

    public String getName() {
        return name;
    }

    public void setWeapon(WeaponEnum weapon) {
        this.weapon = weapon;
    }

    public WeaponEnum getWeapon() {
        return weapon;
    }

}
