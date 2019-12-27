package personal.oop.practice3.company.intf;

public interface Worker extends Company {
    void goCompany();
    void work();

    void setName(String name);
    String getName();
}
