package personal.oop.practice2.intf;

/**
 * @author cho_jeong_ha
 * @project oop-practice
 * @update 2019-12-16
 **/
public interface Company extends Dismissible, Hirable {
    void goToWork(Worker worker);
    void startWork();
    void callTheRoll();
}
