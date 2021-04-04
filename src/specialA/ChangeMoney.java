package specialA;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        // Scanner
        // 메모리   : 18088 KB
        // 시간     : 224ms
        // 코드길이 : 606B

        Scanner scan = new Scanner(System.in);
        int change;
        int coin = 0;
        change = scan.nextInt();

        while (change > 0){

            if (change % 5 == 0) {
                change = change / 5;
                System.out.println("Change 값 : " + change);
                coin = change + coin;
                System.out.println("Coin 값 : " + coin);
                break;
            }else{
                change -=2;
                System.out.println("Change 반복횟수 : "+change);
                coin ++;
                System.out.println("Coin 반복횟수 : "+ coin);
            }
        }

        if (change < 0) {
            System.out.println(-1);
        }else{
            System.out.println("코인 개수 : " +coin);
        }
    }
}
