package personal.oop.practice2.intf;

/**
 * @author cho_jeong_ha
 * @project oop-practice
 * @update 2019-12-16
 **/
public class Main {
    public static void main(String[] args) {
        Company nano = new Nano();

        // 출근
        nano.goToWork(new Programmer("CHO"));
        nano.goToWork(new Programmer("HWANG"));
        nano.goToWork(new Programmer("SON"));
        nano.goToWork(new Ceo("PARK"));

        // 출석
        nano.callTheRoll();

        // 일 시작
        nano.startWork();
    }
}
