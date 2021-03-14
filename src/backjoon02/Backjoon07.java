package backjoon02;


import java.util.Scanner;

public class Backjoon07 {
    public static void main ( String [] args){

        Scanner scan = new Scanner(System.in);

        int value = scan.nextInt();
        String res = "";

        for (int i = 0 ; i < value ; i ++) {
            int frist  = scan.nextInt();
            int second  = scan.nextInt();

            res = res + "Case #"+ (i+ 1) +": " +( frist+ second )+"\n";
        }
        System.out.println(res);
    }
}

