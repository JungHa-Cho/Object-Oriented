package personal.oop.practice3.company;

import personal.oop.practice3.company.intf.*;


public class Main {
    public static void main(String[] args) {

        Worker jun = new Employee();
        Worker cho = new Employee();
        Worker ceo = new Employer();

        jun.setName("Jun");
        cho.setName("Cho");
        ceo.setName("Park");

        jun.goCompany();
        cho.goCompany();
        ceo.goCompany();

        ResearchFloor rsh = new ResearchFloor();
        //rsh.enterCompany(jun);
        //rsh.checkWorker();

        jun.work();
        cho.work();
        ceo.work();

        Employer park = new Employer();
        park.setName("Park");
        park.payBonus(jun);
        park.payBonus(cho);
    }
}
