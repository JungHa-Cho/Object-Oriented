package personal.oop.practice1;

import personal.oop.practice1.abst.Maltese;
import personal.oop.practice1.intf.*;

/**
 * abstract 와 interface 차이점 알기
 * - abstract 는 일반메소드는 강제 오버라이딩아님
 * - interface 는 모든 클래스 오버라이딩
 */
public class Practice {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        // abstract
        System.out.println("-------- Abstract 1");
        personal.oop.practice1.abst.Maltese maltese = new Maltese();
        maltese.bark();
        System.out.println();

        System.out.println("-------- Abstract 2. 이렇게 쓰는일은 언제일까?");
        personal.oop.practice1.abst.Animal malteseanimal = new Maltese();
        malteseanimal.eat();
        malteseanimal.sleep();
        //malteseanimal.bark();     Animal 에 bark()는 선언되어있지 않음.
        System.out.println();

        // interface
        // Dog Interface 로 생성된 instance 라서 bite와 Animal 의 eat, sleep 만 할 수 있음
        System.out.println("-------- Dog Interface");
        Dog jangguni = new personal.oop.practice1.intf.Maltese();
        Dog mme = new Shepherd();

        jangguni.eat();
        jangguni.sleep();
        jangguni.bite();

        mme.eat();
        System.out.println();

        System.out.println("-------- BlackFur Interface");
        BlackFur spd = new Shepherd();
        spd.blackMolting();
        System.out.println();

        System.out.println("-------- go Bathroom");
        Bathroom br = new Bathroom(jangguni);
        br.wash();
        System.out.println();
    }
}
