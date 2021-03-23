package Project01;

import java.util.Scanner;

public class Calculator {
    public static void main ( String [] args){

        Scanner scan = new Scanner(System.in);
        String [] menu = new String[] {"0 : 종료" , "1 : 덧셈" , "2 : 뺄셈" , "3 : 곱셈" , "4 : 나눗셈"};
        int frist, second ;
        int selectNumber= 0;
        int errorCount = 0;
        final int max = 1000000000;

        System.out.println("성민s 계산기");

        while (true){
            for (int i = 0 ; i < menu.length; i ++){
                System.out.println(menu[i]);
            }
            System.out.println("메뉴를 선택하십시오.");

            try {
                selectNumber = Integer.parseInt(scan.next());

                if (selectNumber == 1){
                    System.out.println("덧셈 시작");
                    System.out.println("첫번째 정수를 입력하십시오");
                    frist = scan.nextInt();
                    System.out.println("두번째 정수를 입력하십시오");
                    second = scan.nextInt();
                    System.out.println("결과 :" + Plus(frist,second));
                }else if(selectNumber == 2){
                    System.out.println("뺄셈 시작");
                    System.out.println("첫번째 정수를 입력하십시오");
                    frist = scan.nextInt();
                    System.out.println("두번째 정수를 입력하십시오");
                    second = scan.nextInt();
                    System.out.println("결과 :" + Minus(frist,second));
                }else if (selectNumber == 3){
                    System.out.println("곱셈 시작");
                    System.out.println("첫번째 정수를 입력하십시오");
                    frist = scan.nextInt();
                    System.out.println("두번째 정수를 입력하십시오");
                    second = scan.nextInt();
                    System.out.println("결과 :" + Multi(frist,second));
                }else if (selectNumber == 4){
                    System.out.println("나눗셈 시작");
                    System.out.println("첫번째 정수를 입력하십시오");
                    frist = scan.nextInt();
                    System.out.println("두번째 정수를 입력하십시오");
                    second = scan.nextInt();
                    System.out.println("결과 :" + Div(frist,second));
                }
                else{
                    if (selectNumber == 0){
                        System.out.println("                    ______");
                        System.out.println("프로그램 종료     r-[._.]-r");
                        System.out.println("             =))=)) ------");
                        System.out.println("                  -ㄴ---ㄴ");
                        break;
                    }else if (selectNumber < max){
                        System.out.println("0 부터 4 까지의 숫자를 입력하십시오.");
                    }
                }
            }catch (Exception e){
                errorCount ++;
                System.out.println("에러가 발생했습니다 " + "특수문자 혹은 기호가 감지되었습니다 숫자만 입력하세요. " + e);
                System.out.println("에러 시도 : "  + errorCount + " 회\n" + "5회 이상시 프로그램이 종료됩니다");

                if (errorCount == 5){
                    System.out.println("                    ______");
                    System.out.println("프로그램 종료     r-[._.]-r");
                    System.out.println("             =))=)) ------");
                    System.out.println("                  -ㄴ---ㄴ");
                    System.out.println("잠시후에 다시 시도 해주세요.");
                    break;
                }
            } // catch 끝
        }
    }

    public static int Plus(int num, int num2){
        int a = num;
        int b = num2;
        return a + b;
    }
    public static int Minus (int num , int num2){
        int a = num;
        int b = num2;
        return a-b;
    }
    public static int Multi(int num , int num2){
        int a = num;
        int b = num2;

        return a * b;
    }
    public static int Div(int num, int num2){
        int a = num;
        int b = num2;
        return a / b;
    }
}