package personal.oop.practice2.intf;

/**
 * @author cho_jeong_ha
 * @project oop-practice
 * @update 2019-12-16
 **/
public class Programmer implements Employee {

    private String name;

    public Programmer(String name) {
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println("PROGRAMMER:" + name + ", 일한다.");
    }

    @Override
    public String getName() {
        return name;
    }
}
