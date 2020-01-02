package personal.oop.practice3;

public class Compare {

    public void comPare(String userkey) {

        switch (userkey) {
            case "가위":
                System.out.println( "PAPER" );
                break;
            case "바위":
                System.out.println( "SCISSORS" );
                break;
            case "보":
                System.out.println( "ROCK" );
                break;
        }
    }
}
