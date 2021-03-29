package classExample;

import java.util.Scanner;

public class Add {
    
    public int Plus(int x , int y){

        return x + y;
    }
    public static void main(String [] args){
        
        Add a = new Add();
        Scanner scan = new Scanner(System.in);
        int num , num2,result;
        
        System.out.println("메소드 호출 테스트");
        System.out.println("정수를 입력하세요.");
        num = scan.nextInt();
        System.out.println("정수를 한번 더 입력하세요.");
        num2 = scan.nextInt();

        System.out.println("결과");
        result = a.Plus(num,num2);
        System.out.println(result);
    }
}