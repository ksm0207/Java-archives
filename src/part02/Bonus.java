package part02;

import java.util.Scanner;

public class Bonus {
    public static void main(String [] args){

        final int target = 1000; // 실적목표
        int sales = 0 ; // 실적
        int bonus = 0 ; // 보너스
        String name = ""; // 이름
        boolean result = true; // 실적 성공 유무

        Scanner scan = new Scanner(System.in);
        System.out.println("이름을 입력하세요 : ");
        name = scan.nextLine();
        System.out.println(name + "님 안녕하세요 실적을 입력해주세요(단위 만원) : ");
        sales = scan.nextInt();
        System.out.println("실적값 = "+ sales);

        if (sales >= 1000){
            bonus = (sales - target) / 10;
            System.out.println(result+ " 보너스 " + bonus + "만원이 지급 되었습니다.");
        }else {
            result = false;
            System.out.println(result);
        }
    }
}
