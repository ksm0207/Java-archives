package backjoon02;

import java.util.Scanner;

public class ScoreExample {
    public static void main(String [] args){

        int f_value = 0;
        int result = 0;
        String grade = "";

        Scanner scan = new Scanner(System.in);
        f_value = scan.nextInt();
        result = f_value / 10;

        switch (result){
            case 10:
            case 9:
                grade ="A";
                break;
            case 8:
                grade ="B";
                break;
            case 7:
                grade ="C";
                break;
            case 6:
                grade ="D";
                break;
            default:
                grade = "F";
        }
        System.out.println(grade);
    }
}
