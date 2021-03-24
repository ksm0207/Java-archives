package Blog_part03;

import java.util.Scanner;

public class ArrayTest04 {
    public static void main(String [] args) {

        // 성적 평균 계산하기 프로그램 만들기

        System.out.println("학생 수를 입력하세요 :");
        Scanner scan = new Scanner(System.in);
        final int STUDENTS = scan.nextInt();
        int [] arr = new int [STUDENTS];
        int result = 0;
        System.out.println("입력 하신 학생 수 : " + STUDENTS);

        for (int i = 0 ; i < arr.length; i ++) {
            System.out.println("점수 입력 : ");
            arr[i] = scan.nextInt();
            result += arr[i];
        }
        System.out.println("총 점수 = " + result  +  " 평균 성적은 " + result / STUDENTS + " 입니다");

    }
}
