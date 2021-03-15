package backjoon02;

import java.util.Scanner;

public class Backjoon11 {
    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();

        for (int i = 0 ; i < n ; i ++ )  {
            int check = scan.nextInt();

            if (check < x) {
                System.out.println(check);
            }
        }
    }
}
