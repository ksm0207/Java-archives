package Blog_part02;

import java.util.Scanner;

public class Averager {
    public static void main(String [] args){

        int krValue = 0; // 국어
        int mtValue = 0; // 수학
        int scValue =0;  // 과학
        int enValue = 0; // 영어

        int sum = 0; // 총 합
        int grade = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("-국어 수학 과학 영어 평균점수 내기-");


        while (true) {

            System.out.println("국어점수 입력");
            krValue = scan.nextInt();
            System.out.println("국어 :" + krValue);

            System.out.println("수학점수 입력");
            mtValue = scan.nextInt();
            System.out.println("수학 :" + mtValue);


            System.out.println("과학점수 입력");
            scValue = scan.nextInt();
            System.out.println("과학 :" + scValue);

            System.out.println("영어점수 입력");
            enValue = scan.nextInt();
            System.out.println("영어 :" + enValue);

            sum = krValue + mtValue + scValue + enValue;
            System.out.println("총합 = " + sum);
            break;
        }

        System.out.println(" 평균은 " + sum / 4 + " 점 입니다 ");

        grade = sum / 4;
        if (grade >= 90 && grade <= 100) {
            System.out.println("학점 A+ 입니다");
        }else if (grade >= 80){
            System.out.println("학점 B+ 입니다");
        }else if (grade >= 70){
            System.out.println("학점 B 입니다");
        }else if (grade >= 60){
            System.out.println("학점 C 입니다");
        }
        else{
            System.out.println("조금 더 분발하세요 !");
        }
    }
}
