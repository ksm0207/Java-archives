package BlogPost;

import java.util.Scanner;

public class ArithmeticException{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int x = 0;
        int y = 0;
        double res = 0.0;

        System.out.println("첫번째 정수를 입력하세요");
        x = scan.nextInt();
        System.out.println("두번째 정수를 입력하세요");
        y = scan.nextInt();

        try {
            res = x / y;
            System.out.println(res);
        }catch (java.lang.ArithmeticException error){
            System.out.println("Error : "+ error.getMessage());
        }
    }
}
