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
    private Ceo park;

    public Nano() {
        goToWorkers = new ArrayList<>();
    }

    @Override
    public void goToWork(Worker worker) {
        goToWorkers.add(worker);
        if (worker instanceof Ceo) {
            park = (Ceo) worker;
            park.setWorkerList(goToWorkers);
        }
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

    @Override
    public void doFire(String name) {
        Worker dismissWorker = null;
        for (Worker worker : goToWorkers) {
            if (worker.getName().contains(name)) {
                dismissWorker = worker;
            }
        }

        if (dismissWorker == null) {
            System.out.println("해고할 사람이 없네?");
        } else {
            System.out.println(dismissWorker.getName() + "아, 너 왜이렇게 일을 못해, 너 해고야");
            goToWorkers = park.fire((Employee) dismissWorker);
        }
    }

    @Override
    public void doHire(String name) {
        System.out.println(name + " 너 채용");
        goToWorkers = park.hire(new Programmer(name));
    }
}
