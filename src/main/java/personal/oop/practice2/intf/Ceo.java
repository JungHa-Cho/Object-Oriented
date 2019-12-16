package personal.oop.practice2.intf;

/**
 * @author cho_jeong_ha
 * @project oop-practice
 * @update 2019-12-16
 **/
public class Ceo implements Employer {

    private String name;

    public Ceo(String name) {
        this.name = name;
    }

    @Override
    public void hire(Employee employee) {

    }

    @Override
    public void fire(Employee employee) {

    }

    @Override
    public void work() {
        System.out.println("CEO:" + name + ", 일한다.");
    }

    @Override
    public String getName() {
        return name;
    }
}
