package backjoon02;

import java.util.Scanner;

public class CompareExample {
    public static void main(String [] args){

        int f_value = 0;
        int s_value = 0;
        Scanner scan = new Scanner(System.in);
        f_value = scan.nextInt();
        s_value = scan.nextInt();

        if (f_value < s_value){
            System.out.println("<");
        }else if (f_value == s_value){
            System.out.println("==");
        }else{
            System.out.println(">");
        }
    }
}
