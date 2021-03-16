package blog_part02;

import java.util.Scanner;

public class ScoreExample {
    public static void main(String [] args){

        int score = 0; // 학점
        int result = 0; // 합
        String grade = ""; // 등급

        Scanner scan = new Scanner(System.in);
        System.out.println("자신의 학점을 입력하십시오 : ");
        score = scan.nextInt();
        result = score / 10;

        switch (result){
            case 10:
            case 9:
                 grade="A+";
                 break;
            case 8:
                 grade="A";
                 break;
            case 7:
                 grade="B+";
                 break;
            case 6:
                 grade="B";
                 break;
            case 5:
                 grade="C";
                 break;
            default:
                grade="F";
                break;
        }
        System.out.println("학점 결과 : " + grade +  " 입니다 ");
    }
}
