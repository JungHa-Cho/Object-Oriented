package personal.oop.practice3;

public enum WeaponEnum {

    ROCK("바위"),
    PAPER("보자기"),
    SCISSORS("가위");

    private String name;

    WeaponEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static WeaponEnum getWeaponEnum(String weaponType) {
        for (WeaponEnum weaponEnum : WeaponEnum.values()) {
            if (weaponEnum.name() == weaponType)
                return weaponEnum;
        }
        return null;
    }

}
