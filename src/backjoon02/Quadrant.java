package backjoon02;

import java.util.Scanner;

public class Quadrant {
    public static void main(String [] args){

        int x = 0;
        int y = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("x 정수를 입력하세요 : ");
        x = scan.nextInt();
        System.out.println("y 정수를 입력하세요");
        y = scan.nextInt();

        System.out.println("x : " + x + " y : " + y);

        if ( x > 0 ) {
            if (y > 0) {
              System.out.println(1);
            }
            else{
               System.out.println(4);
            }
        }else{

            if (y > 0) {
                System.out.println(2);
            }else{
                System.out.println(3);
            }
        }
    }
}
