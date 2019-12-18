package personal.oop.practice2.intf;

/**
 * @author cho_jeong_ha
 * @project oop-practice
 * @update 2019-12-16
 **/
public class WorkFlow {
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

        System.out.println("-------------");

        // 하이 피치
        nano.doFire("CHO");
        nano.doFire("SON");

        nano.startWork();

        System.out.println("-------------");

        // 로우 피치
        nano.doHire("JH");
        nano.doHire("JN");

        nano.startWork();
    }
}
