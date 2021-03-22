package Project01;

import java.util.Scanner;

public class Calculator {
    public static void main ( String [] args){

        Scanner scan = new Scanner(System.in);
        String [] menu = new String[] {"0 : 종료" , "1 : 덧셈" , "2 : 뺄셈"};
        int frist = 0;
        int second = 0;
        int selectNumber= 0;
        boolean is = true;

        System.out.println("성민s 계산기");
        while (true){
            for (int i = 0 ; i < menu.length; i ++){
                System.out.println(menu[i]);
            }
            System.out.println("메뉴를 선택하십시오.");
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
            }else{
                if (is){
                    is = false;
                    System.out.println(is);
                    System.out.println("              ______");
                    System.out.println("시스템 종료  r-[._.]-r");
                    System.out.println("       =))=)) ------");
                    System.out.println("             -ㄴ---ㄴ");
                    break;
                }
            }
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
}