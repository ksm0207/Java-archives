package backjoon02;


import java.util.Scanner;

public class Backjoon07 {
    public static void main ( String [] args){

        Scanner scan = new Scanner(System.in);

        int value = scan.nextInt();
        String res = "";
        int count = 0;

        for (int i = 0 ; i < value ; i ++) {
            int frist  = scan.nextInt();
            int second  = scan.nextInt();

            res = res + "Case #"+ (i+ 1) +": " +( frist+ second )+"\n";
//            if( !(i < value - 1)) {
//                res = res +  "\n";
//            }
        }
        System.out.println(res);
    }
}

