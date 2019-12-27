package personal.oop.practice3.company.intf;

import java.util.List;

public class ResearchFloor implements Building{

    List<Worker> workers;

    @Override
    public void enterCompany(Worker worker) {
        workers.add(worker);
    }

    @Override
    public void checkWorker(){
        for (Worker worker : workers) {
            System.out.println(worker.getName() + "출근 확인");
        }
    }
}
