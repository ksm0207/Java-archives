package Blog_part02;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String [] args){

        int case_number = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("0부터 3까지 입력해보세요");
        case_number = scan.nextInt();

        switch (case_number){
            case 0:
                System.out.println("0 입니다");
            case 1:
                System.out.println("1 입니다");
            case 2:
                System.out.println("2 입니다");
            case 3:
                System.out.println("3 입니다");
            default:
                System.out.println("0~3 까지 의 정수 값만 받습니다..");
                break;
        }
    }
}
