package part03;

import java.util.Scanner;

public class LeapYear {
    public static void main(String [] args){

        int year = 0;
        Scanner scan = new Scanner(System.in);
        year = scan.nextInt();

        if (year %4 == 0){
            if (year % 400 != 0 && year % 100 == 0){
                System.out.println("0");
            }else{
                System.out.println("1");
            }
        }else {
            System.out.println("0");
        }
    }
}
