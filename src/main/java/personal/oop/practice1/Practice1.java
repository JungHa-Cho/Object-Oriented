package personal.oop.practice1;

import personal.oop.practice1.abst.Manabst;
import personal.oop.practice1.intf.Action;
import personal.oop.practice1.intf.Man;
import personal.oop.practice1.intf.People;
import personal.oop.practice1.intf.Woman;

import java.nio.file.Watchable;

/**
 * @author cho_jeong_ha
 * @project oop-practice
 * @update 2019-12-02
 * @description Animal Modeling Practice.
 **/
public class Practice1 {
    public static void main(String[] args) {
        People man = new Man();
        People woman = new Woman();
        System.out.println("난 남자 ");
        man.love();
        man.move();
        man.sex();
        man.work();
        man.anger();
        man.cry();
        man.happy();
        man.hate();
        man.love();
        System.out.println("----------------------------------------------------------");
        System.out.println("난 여자 ");
        woman.love();
        woman.move();
        woman.sex();
        woman.work();
        woman.cry();
        woman.happy();
        woman.hate();
        woman.love();

        System.out.println("----------------------------------------------------------");
        System.out.println("추상 클래스");

        Manabst manabst = new Manabst();
        manabst.cry();
        manabst.happy();
    }
}