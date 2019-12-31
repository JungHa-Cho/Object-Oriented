package personal.oop.practice2.intf;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

import java.util.List;

public interface Employer extends Worker {
    List<Worker> hire(Employee employee);
    List<Worker> fire(Employee employee);
    void bonus();
}
