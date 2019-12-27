package personal.oop.practice2.intf;

public class Bathroom {

    // 속성을 표현하는 '필드'
    private Animal animal;

    // 생성된 객체의 필드를 초기화 하는 생성자
    public Bathroom(Animal animal) {
        this.animal = animal;
    }

    // 기능을 표현하는 메소드
    public void wash() {
        animal.wash();
    }

}