package personal.oop.practice2.intf;

import java.util.List;

/**
 * @author cho_jeong_ha
 * @project oop-practice
 * @update 2019-12-16
 **/
public class Ceo implements Employer {

    private String name;
    private List<Worker> workerList;

    public Ceo(String name) {
        this.name = name;
    }

    public void setWorkerList(List<Worker> workerList) {
        this.workerList = workerList;
    }

    @Override
    public List<Worker> hire(Employee employee) {
        workerList.add(employee);
        return workerList;
    }

    @Override
    public List<Worker> fire(Employee employee) {
        Worker dismissWorker = null;
        for (Worker worker : workerList) {
            if (worker.getName().contains(employee.getName())) {
                dismissWorker = worker;
            }
        }

        workerList.remove(dismissWorker);

        return workerList;
    }

    @Override
    public void work() {
        System.out.println("CEO:" + name + ", 일한다.");
    }

    @Override
    public String getName() {
        return name;
    }
}
