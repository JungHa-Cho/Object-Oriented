package personal.oop.practice1.abst;

/**
 * @author cho_jeong_ha
 * @project oop-practice
 * @update 2019-12-06
 **/
public enum Smell {
    HIGH("죽겠다... 지린내.."),
    MEDIUM("참을만한 지린내"),
    LOW("지린내 덜함");

    private String property;

    Smell(String property) {
        this.property = property;
    }


    @Override
    public String toString() {
        return property;
    }
}
