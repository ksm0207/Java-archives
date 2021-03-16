package blog_part02;

import java.util.Scanner;

public class WhileExample01 {
    public static void main(String [] args){

        int number =0;
        int default_value = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("입력한 값 까지 정수 값 입력 하기 : ");
        number = scan.nextInt();

        while (default_value < number){
            System.out.println(default_value);
            default_value ++;
        }
    }
}
