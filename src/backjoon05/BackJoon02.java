package backjoon05;

import java.util.Scanner;

public class BackJoon02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int forCount = scan.nextInt();
        int sum = 0;
        String value = scan.next();

        for (int i = 0 ; i < forCount ; i ++) {

            sum += value.charAt(i)-48;
        }
        System.out.println(sum);
    }
}
