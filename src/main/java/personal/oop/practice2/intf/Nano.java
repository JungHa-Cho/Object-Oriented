package personal.oop.practice2.intf;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cho_jeong_ha
 * @project oop-practice
 * @update 2019-12-16
 **/
public class Nano implements Company {

    private List<Worker> goToWorkers;

    public Nano() {
        goToWorkers = new ArrayList<>();
    }

    @Override
    public void goToWork(Worker worker) {
        goToWorkers.add(worker);
    }

    @Override
    public void startWork() {
        for (Worker worker : goToWorkers) {
            worker.work();
        }
    }

    @Override
    public void callTheRoll() {
        for (Worker worker : goToWorkers) {
            System.out.println("출근 완료 - " + worker.getName());
        }
    }
}
