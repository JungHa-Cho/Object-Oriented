package personal.oop.practice1.abst;

public class Manabst extends Peopleabst {
    /**
     * 추상 메소드 오버라이딩 ( 재정의 )
     */
    @Override
    public void cry() {
        System.out.println("남자는 운다");
    }

    /**
     * 추상 클래스 happy 메소드 오버라이딩( 재정의 ).
     */
    @Override
    public void happy(){
       System.out.println("맨 클래스");
    }
}
