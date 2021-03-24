package Blog_part03;

import java.util.Scanner;

public class Student {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        // 3행 4열 배열 선언
        String [] [] arr = new String[3][4];
        // 메뉴 배열
        String [] menu = new String [] {"0 : 종료하기","1 : 성적입력","2 : 전체 출력"};

        int check =0 , value;
        System.out.println("성적입력 프로그램 시작하기");

        do {

            for(int i = 0; i < menu.length ; i ++) {
                System.out.println(menu[i]);
            }
            System.out.println("메뉴를 선택하십시오 : ");
            value = Integer.parseInt(scan.nextLine());

            switch (value){

                case 1:
                        System.out.println("이름");
                        arr[check][0] = scan.nextLine();

                        System.out.println("국어 성적");
                        arr[check][1] = scan.nextLine();

                        System.out.println("영어 성적");
                        arr[check][2] = scan.nextLine();

                        System.out.println("수학 성적");
                        arr[check][3] = scan.nextLine();

                        check ++;
                        System.out.println("Exit");
                        break;
                case 2:
                    if (arr[0][0] == null) {
                        System.out.println("요청한 정보가 없습니다");
                    }else{
                        for (int i = 0 ; i < arr.length && i < check ;  i ++) {
                            System.out.println("이름 : " + arr[i][0] + "\n" + "국어 : " + arr[i][1] + "\n" + "영어 : " + arr[i][2] + "\n" + "수학 : " + arr[i][3]);
                        }
                        break;
                    }
                default:
                        break;
            }
        }while (value != 0);
            System.out.println("프로그램 종료");
    }
}
