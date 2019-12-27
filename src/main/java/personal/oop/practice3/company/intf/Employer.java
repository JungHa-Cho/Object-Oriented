package personal.oop.practice3.company.intf;

public class Employer implements Worker {

    private String name;

    @Override
    public void goCompany(){
        System.out.println(name + " 회사간다.");
    }

    @Override
    public void work() {
        System.out.println(name + "도 일한다.");
    }

    public void payBonus(Worker worker) {
        System.out.println(this.name + "은 " + worker.getName() + "에게 보너스 준다.");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
