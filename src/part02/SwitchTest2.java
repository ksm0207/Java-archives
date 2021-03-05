package part02;

import java.util.Scanner;

public class SwitchTest2 {
    public static void main(String [] args){

        String month ="";
        Scanner scan = new Scanner(System.in);
        System.out.println("1 월 ~ 12월 숫자만 입력하기 : ");
        month = scan.nextLine();
        switch (month){
            case "1":
                System.out.println("1월");
                break;
            case "2":
                System.out.println("2월");
                break;
            case "3":
                System.out.println("3월");
                break;
            case "4":
                System.out.println("4월");
                break;
            case "5":
                System.out.println("5월");
                break;
            case "6":
                System.out.println("6월");
                break;
            case "7":
                System.out.println("7월");
                break;
            case "8":
                System.out.println("8월");
                break;
            case "9":
                System.out.println("9월");
                break;
            case "10":
                System.out.println("10월");
                break;
            case "11":
                System.out.println("11월");
                break;
            case "12":
                System.out.println("12월");
                break;
            default:
                System.out.println("None");
        }
    }
}
