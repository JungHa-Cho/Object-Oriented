package personal.oop.practice1.intf;

public class Man implements People {
    @Override
    public void love() {
        System.out.println("한 여자를 사랑했다");
    }

    @Override
    public void move() {
        System.out.println("한 여자와 움직였다");
    }

    @Override
    public void sex() {
        System.out.println("한 여자와 사랑을 나누었다");
    }

    @Override
    public void work() {
        System.out.println("일을 하러간다 ㅅㅂ .... 개춥네 ( 남자 ) 현장직..");
    }

    @Override
    public void anger() {
        System.out.println("여자와 싸워서 기분이 나쁘다");
    }

    @Override
    public void cry() {
        System.out.println("여자와 헤어져서 슬프다");
    }

    @Override
    public void happy() {
        System.out.println("여자를 사랑해서 행복하다");
    }

    @Override
    public void hate() {
        System.out.println("여자를 미워한다");
    }
}
