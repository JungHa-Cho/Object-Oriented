package personal.oop.practice3.company.intf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * The type Employer.
 */
public class Employer implements Worker {

    private String name;
    //private Status type;
    private List<Worker> workers;

    /**
     * Instantiates a new Employer.
     *
     * @param name the name
     */
    public Employer(String name) {
        this.name = name;
        //this.type = Status.HOME;
        this.workers = new ArrayList<>();
    }

    @Override
    public void leaveHome() {
        //type = Status.LEAVE;
        System.out.println(name + " 집을 떠난다.");
    }

    @Override
    public void work() {
        System.out.println(name + "도 일한다.");
    }

    /**
     * Remember workers.
     *
     * @param workers the workers
     */
    public void rememberWorkers(List<Worker> workers) {
        this.workers = workers;
    }

    /**
     * Pay bonus.
     */
    public void payBonus() {
        Worker happyWorker = workers.get(new Random().nextInt(1));
        System.out.println("이번달은 " + happyWorker.getName() + " 너 보너스!");
    }

    /**
     * Stop work.
     */
    public void stopWork() {
        for (Worker worker : workers) {
            System.out.println(worker.getName() + "야 오늘은 여기까지해!");
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
