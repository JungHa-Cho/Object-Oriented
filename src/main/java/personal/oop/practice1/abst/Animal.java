package personal.oop.practice1.abst;

/**
 * The type Animal.
 *
 * @author cho_jeong_ha
 * @project oop -practice
 * @update 2019 -12-04
 */
public abstract class Animal {

    private Smell power;

    /**
     * Instantiates a new Animal.
     */
    Animal() {
        power = Smell.LOW;
    }

    /**
     * 먹이다.
     */
    protected void feed() {
        System.out.println("와구와구 먹습니다.");
    }

    /**
     * 냄새를 풍기다.
     */
    protected void stink() {
        System.out.println(power.toString());

        switch (power) {
            case HIGH:
                power = Smell.LOW;
                break;
            case MEDIUM:
                power = Smell.HIGH;
                break;
            case LOW:
                power = Smell.MEDIUM;
                break;
        }
    }

    /**
     * Do action.
     * 동물이 가지고있는 개개인의 behavior 특성이 발현된다.
     * 어떤 행동이든 발현.
     * 동물의 종류는 여러가지가 있으므로, 각자가 상속받아 사용함.
     */
    abstract void doBehavior();
}
