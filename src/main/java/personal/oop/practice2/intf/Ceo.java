package personal.oop.practice2.intf;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cho_jeong_ha
 * @project oop-practice
 * @update 2019-12-16
 **/
public class Ceo implements Employer {

    private String name;
    private List<Worker> wokerList;

    public Ceo(String name) {
        this.name = name;
        wokerList = new ArrayList<>();
    }

    public void setWokerList(List<Worker> workerList) {
        this.wokerList = workerList;
    }

    @Override
    public List<Worker> hire(Employee employee) {
        wokerList.add( employee );
        return wokerList;
    }

    @Override
    public List<Worker> fire(Employee employee) {
        Worker dismissWorker = null;
        for (Worker worker : wokerList) {
            if (worker.getName().contains( employee.getName() )) {
                System.out.println( worker.getName() + " : 님은 해고 되어습니다." );
                dismissWorker = worker;
            }
        }
        wokerList.remove( dismissWorker );

        return wokerList;
    }

    @Override
    public void work() {
        System.out.println( "CEO:" + name + ", 일한다." );
    }

    @Override
    public String getName() {
        return name;
    }
}
