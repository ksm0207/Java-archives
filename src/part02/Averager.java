package part02;

import java.util.Scanner;

public class Averager {
    public static void main(String [] args){

        int value = 0;
        int value2 = 0;
        int value3 =0;
        int value4 = 0;
        int sum = 0;
        String name = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("-국어 수학 과학 영어 평균점수 내기-");
        System.out.println("당신의 이름은 무엇입니까 ? ");

        name = scan.nextLine();
        System.out.println(name + "님 안녕하세요 ");

        for (int i = 1 ; i <= 4 ; i ++) {

            System.out.println("국어점수 입력");
            value = scan.nextInt();
            System.out.println("국어 :" + value);

            System.out.println("수학점수 입력");
            value2 = scan.nextInt();
            System.out.println("수학 :" + value2);


            System.out.println("과학점수 입력");
            value3 = scan.nextInt();
            System.out.println("과학 :" + value3);

            System.out.println("영어점수 입력");
            value4 = scan.nextInt();
            System.out.println("영어 :" + value4);

            sum = value + value2 + value3 + value4;
            System.out.println("총합 = " + sum);
            break;
        }
        System.out.println(name+ " 님의 " +" 평균은 " + sum / 4 + " 입니다 ");
    }
}
