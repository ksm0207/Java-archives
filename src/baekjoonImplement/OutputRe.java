package baekjoonImplement;

import java.util.Scanner;

public class OutputRe {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        String str = "";

        while (scan.hasNextLine()){

            str = scan.nextLine();

            if (str == null || str.length() > 1000) {
                break;
            }
            System.out.println(str);
        }
        scan.close();
    }
}
