package personal.oop.practice3;

import java.util.Random;

public class Compare {

    private int comnumber;

    public void comPare(int usernumber) {
        Random random = new Random();

        comnumber = random.nextInt( 3 );

        switch (usernumber) {
            case 0:
                System.out.println( "PAPER" );
                if (usernumber == 0 && comnumber == 1) {
                    System.out.println();
                }
                break;
            case 1:
                System.out.println( "SCISSORS" );
                if () {

                }
                break;
            case 2:
                System.out.println( "ROCK" );
                if () {

                }
                break;
        }
    }
}
