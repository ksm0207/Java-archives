package BlogPost;

import java.util.Scanner;

public class NumberFormatException {

    public int parseInt(String str){
        try {
            System.out.println("Result : " + str);
            return Integer.parseInt(str);

        }catch (java.lang.NumberFormatException error){
            System.out.println("Catch 발생");
            System.out.println(error);
            System.out.println(error.getMessage());
            return 0;
        }
    }

    public static void main(String[] args) {
        NumberFormatException nfe = new NumberFormatException();
        Scanner scan = new Scanner(System.in);
        String strInput = scan.next();
        nfe.parseInt(strInput);
    }
}
