package personal.oop.practice3;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    private static int counter = 0;

    private String playerName;

    private Scanner scanner;

    private String userKey;


    /*
     * Arrays.asList
     * 배열을 리스트로 반환.
     *
     */
    public Player() {

        scanner = new Scanner( System.in );

        setUser();

        setGameCounter();
    }

    /*
     * setUser
     */
    private void setUser() {
        System.out.println( "                 유저를 입력하세요" );

        playerName = scanner.next();

    }

    /*
     * setGameCounter
     */
    private void setGameCounter() {
        System.out.println( "       게임을 실행할 횟수를 입력하세요" );

        counter = Integer.parseInt( scanner.next() );

    }

    /*
     * getPlayerName
     */
    public String getPlayerName() {
        System.out.println( "     등록 하신 게임 플레이어는 " + playerName + " 입니다." );

        return playerName;
    }

    /*
     * getCounter
     */
    public int getCounter() {
        System.out.println( "         게임을 실행할 횟수는 " + counter + " 입니다." );

        return counter;
    }

    public String getUserKey(){
        System.out.println( "       가위 , 바위 , 보중 선택하세요" );

        userKey = scanner.next();

        return userKey;
    }

}
