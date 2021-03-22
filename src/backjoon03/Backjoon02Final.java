package backjoon03;

import java.util.Scanner;

public class Backjoon02Final {
    public static void main(String [] args){
        // 1. 9개의 서로 다른 자연수가 주어집니다
        // 2. 이들 중 최대값을 찾고 몇번째 수인지 출력하십시오

        Scanner scan = new Scanner(System.in);
        int value;
        int max = 0;
        int countIndex = 0;
        int index = 0;

        for (int i= 0 ; i < 9 ; i ++){
            value = scan.nextInt();
            countIndex ++;

            System.out.println("카운트 발생 : "+countIndex);

            if (value > max) {
                max = value;
                index = countIndex;
            }else{
                System.out.println("Max 보다 작은 값 : " + value);
            }
        }
        System.out.println("최대 값 :" + max + "최대 값 위치 : " +  index);
    }
}
