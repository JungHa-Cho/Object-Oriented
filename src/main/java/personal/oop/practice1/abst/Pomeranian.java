package personal.oop.practice1.abst;

/**
 * @author cho_jeong_ha
 * @project oop-practice
 * @update 2019-12-04
 **/
public class Pomeranian extends Dog {
    @Override
    public void bark() {
        System.out.println("[포메라니안] 왈멍왈멍");
    }

    @Override
    void doBehavior() {

    }

    /*@Override
    public void smell() {
        System.out.println("[포메라니안] 개 지린내");
    }*/
}
