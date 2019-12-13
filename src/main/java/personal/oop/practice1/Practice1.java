package personal.oop.practice1;

import personal.oop.practice1.abst.Pomeranian;
import personal.oop.practice1.intf.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cho_jeong_ha
 * @project oop-practice
 * @update 2019-12-02
 * @description Animal Modeling Practice.
 **/
public class Practice1 {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();

        // interface
        Dog navi = new Poodle(); // 나비
        Dog chorong = new WelshCorgi(); // 초롱이
        Dog dori = new Dachshund(); // 도리

        // Dog Interface 로 생성된 instance 라서 짖기 밖에 못함
        System.out.println("-------- Dog Interface");
        navi.bark();
        chorong.bark();
        dori.bark();
        System.out.println();

        ShortLeg shortChorong = new WelshCorgi(); // 다리 짧은 초롱이
        ShortLeg shortDori = new Dachshund(); // 다리 짧은 도리
        // 다리 짧은 나비는 다리 짧은 interface 가 구현 되지 않아서 인스턴스 생성이 불가능
        // ShortLeg shortNavi = new Poodle();

        // ShortLeg Interface 로 생성된 instance 는 다리까지 짧음
        System.out.println("-------- ShortLeg Interface");
        shortChorong.step();
        shortChorong.bark();
        shortDori.step();
        shortDori.bark();
        System.out.println();

        // Animal 로 생성됨
        Animal animalPoodle = new Poodle();
        Animal animalChorong = new WelshCorgi();
        Animal animalDori = new Dachshund();
        Animal animalSparrow = new Sparrow();
        Animal animalEagle = new Eagle();

        System.out.println("-------- Animal Interface");
        animalPoodle.eat();
        animalChorong.eat();
        animalDori.eat();
        animalSparrow.eat();
        animalEagle.eat();
        System.out.println();

        Bird birdSparrow = new Sparrow();
        Bird birdEagle = new Eagle();

        System.out.println("-------- Bird Interface");
        birdSparrow.eat();
        birdSparrow.twitter();
        birdEagle.eat();
        birdEagle.twitter();
        System.out.println();

        System.out.println("-----------------------1111---------------------------");
        FeedGround ground = new FeedGround(navi);
        ground.feed();

        FeedGround birdGround = new FeedGround(birdSparrow);
        birdGround.feed();
        System.out.println();

        // 오버라이딩을 통해 자식이 동작을 구현했다면 부모는 그동작을 사용가능>????
        System.out.println("--------------------------------------------------");
        Pomeranian pomeranian = new Pomeranian("흰둥이");
        pomeranian.bark();
        pomeranian.eat();
        pomeranian.smell();
        System.out.println();

        personal.oop.practice1.abst.Dog pomeranianDog = new Pomeranian("검둥이");
        pomeranianDog.bark();
        pomeranianDog.eat();
        pomeranianDog.smell();
        System.out.println();

        personal.oop.practice1.abst.Animal pomeranianAnimal = new Pomeranian("발발이");
        // pomeranianAnimal.bark();
        pomeranianAnimal.eat();
        pomeranianAnimal.smell();


    }
}