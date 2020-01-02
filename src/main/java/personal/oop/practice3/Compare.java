package personal.oop.practice3;

public class Compare {

    public void comPare(Type type) {

        switch (type) {
            case PAPER:
                System.out.println( "PAPER" );
                break;
            case SCISSORS:
                System.out.println( "SCISSORS" );
                break;
            case ROCK:
                System.out.println( "ROCK" );
                break;
        }
    }
}
