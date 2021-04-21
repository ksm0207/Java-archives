package baekjoonMath;

import java.util.Scanner;

public class SnackScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int k = scan.nextInt();
        int n = scan.nextInt();
        int m = scan.nextInt();

        int needM = (k * n) - m;

        if ( (k * n) > m ) {
            System.out.println(needM);
        } else if ( ( k * n ) == m) {
            System.out.println(needM);
        }else{
            System.out.println(0);
        }
    }
}
