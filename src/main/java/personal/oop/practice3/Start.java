package personal.oop.practice3;

public class Start {

    private int counter;

    private String userKey;

    private int userNumber;


    public Start() {

        System.out.println("-----------------------------");
        System.out.println("                가위 바위 보 게임");
        System.out.println("-----------------------------");

        test();

    }
    private void test(){
        Player player = new Player();

        Compare compare = new Compare();

        counter = player.getCounter();

        for(int coin = 0; coin < counter; coin++){

            userKey = player.getUserKey();
            if ( userKey.equals( "가위" )){
                userNumber = 0;
            }
            else if ( userKey.equals( "바위" )){
                userNumber = 1;
            }
            else if ( userKey.equals( "보" )){
                userNumber = 2;
            }
            else {
                System.exit( 0 );
            }
            compare.comPare( userNumber );
        }
    }

    private void result(){

    }


}
