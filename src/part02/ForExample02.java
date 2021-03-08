package part02;

import java.util.Scanner;

public class ForExample02 {
    public static void main(String [] args){

        int value = 0;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("구하고자 하는 정수 n 의 합을 입력하시오 : ");
        value = scan.nextInt();

        for (int i= 0 ; i <= value; i ++ ) {
            sum = sum + i;
        }
        System.out.println("입력한 정수" + value + "의 총 합은 = " +  sum + " 입니다 ");

    }
}
