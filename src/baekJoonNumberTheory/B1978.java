package baekJoonNumberTheory;


import java.util.Scanner;

public class B1978 {
    public static void main(String[] args)    {
        // Git - 백준 1978 소수 찾기 ( 분류 : 정수론 )

        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();


        for (int i = 2 ; i <= count; i ++) {
            boolean isCheck = true;

            for (int j = 2 ; j * j <= i; i ++){
                isCheck = false;
                break;
            }
            if (isCheck) {
                System.out.println(i + " ");
            }
        }


    }
}
