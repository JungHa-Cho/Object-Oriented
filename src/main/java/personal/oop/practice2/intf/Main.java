package personal.oop.practice2.intf;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cho_jeong_ha
 * @project oop-practice
 * @update 2019-12-16
 **/
public class Main {
    public static void main(String[] args) {
        Company nano = new Nano();
        //ceo.hire( new Programmer( "jihwan" ) );

        Employer employer = new Ceo( "PARK" );
//
//        workerList.add( new Programmer( "hwang" ) );
//        workerList.add( new Programmer( "cho" ));
//        workerList.add( new Programmer( "son" ) );
//
//        System.out.println(workerList);

        nano.goToWork( new Ceo( "PARK" ) );

        //employer.hire( new Programmer( "jihwan" ) );
        //for

        //employer.fire( new Programmer( "jihwan" ) );


        employer.hire( new Programmer( "jihwan" ) );
        employer.hire( new Programmer( "jihwan1" ) );
        employer.hire( new Programmer( "jihwan2" ) );

        employer.bonus();

        // 출근
//        nano.goToWork(new Programmer("CHO"));
//        nano.goToWork(new Programmer("HWANG"));
//        nano.goToWork(new Programmer("SON"));
//        nano.goToWork(new Ceo("PARK"));


        // 출석
//        nano.callTheRoll();
//
//        // 일 시작
//        nano.startWork();

//        System.out.println("------------------");
//
//        //nano.doFire( "jihwan" );
//
//        nano.doHire( "jihwan2" );


    }
}

