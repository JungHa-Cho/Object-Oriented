package personal.oop.practice2.intf;

import java.util.List;

/**
 * @author cho_jeong_ha
 * @project oop-practice
 * @update 2019-12-16
 **/
public interface Employer extends Worker {
    List<Worker> hire(Employee employee);
    List<Worker> fire(Employee employee);
}
