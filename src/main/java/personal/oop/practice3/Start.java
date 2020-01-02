package personal.oop.practice3;

public class Start {

    private int counter;

    private String userKey;


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

            compare.comPare( userKey );

        }
    }

    private void result(){

    }
}
