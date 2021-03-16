package blog_part02;

import java.util.Scanner;

public class Larger2 {
    public static void main(String [] args){

        int f_value =0;
        int s_value =0;
        int result = 0;
        String str = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("첫번째 정수를 입력하세요 : ");
        f_value = scan.nextInt();
        System.out.println("두번째 정수를 입력하세요 : ");
        s_value = scan.nextInt();

        result = f_value;
        System.out.println(result);

        result = s_value;
        System.out.println(result);

        if ( f_value < s_value){
            result = f_value;
            str = "첫번째";
        }else{
            result = s_value;
            str = "두번째";
        }
        System.out.println("가장 적은 수 " + result + " 입니다 "+ str + " 정수가 적어요");
    }
}
