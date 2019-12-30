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
            park.setWokerList( goToWorkers );
            System.out.println("gotoworkers list add");
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
            System.out.println("1. 출근 완료 - " + worker.getName());
        }
    }

    @Override
    public void doFire(String name) {
        Worker dismissWorker = null;
        for (Worker worker : goToWorkers){
            if(worker.getName().contains( name )){
                dismissWorker = worker;
            }
        }
        if ( dismissWorker == null){
            System.out.println("해고 없다");
        }else {
            System.out.println(dismissWorker.getName() + "해고다" );
        }
    }

    @Override
    public void doHire(String name) {
        System.out.println(name + " : 고용한다");
        goToWorkers = park.hire( new Programmer( name ) );

    }
}
