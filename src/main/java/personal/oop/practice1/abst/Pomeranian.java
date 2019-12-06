package personal.oop.practice1.abst;

/**
 * @author cho_jeong_ha
 * @project oop-practice
 * @update 2019-12-04
 **/
public class Pomeranian extends Dog {

    @Override
    void doBehavior() {
        System.out.println("[포메라니안] 작고 쪼메난게 설쳐댐. 까불까불 왔다갔다 애교도");
    }

    @Override
    public void bark() {
        System.out.println("[포메라니안] 와로아ㅗ라와와왈");
    }

    public void doFeed() {
        feed();
    }
}
