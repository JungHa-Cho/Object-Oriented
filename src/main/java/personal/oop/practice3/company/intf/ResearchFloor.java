package personal.oop.practice3.company.intf;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Research floor.
 */
public class ResearchFloor implements Building {

    private List<Worker> workers;
    private Employer ceo;

    public ResearchFloor() {
        this.workers = new ArrayList<>();
    }

    @Override
    public boolean comeToWork(Worker worker) {
        if (worker instanceof Employee) {

            System.out.println(worker.getName() + ": 안녕하세요");
            workers.add(worker);

        } else if (worker instanceof Employer) {

            System.out.println("안녕하세요 " + worker.getName() + " 사장님, 반갑지만 사장님방으로 가세요.");
            ceo = (Employer) worker;
            ceo.rememberWorkers(workers);

        } else {
            return false;
        }
        return true;
    }

    @Override
    public void checkWorker(Employer employer) {
        for (Worker worker : workers) {
            System.out.println(employer.getName() + ": " + worker.getName() + "씨 출근 잘했어요?");
        }
    }
}
