package backjoon02;

import java.util.Scanner;

public class Backjoon05 {
    public static void main(String [] args){
        // 자연수 N이 주어졌을때 1부터 N까지 한줄에 하나씩 출력하는 프로그램
        int num = 0;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        for (int i = 1 ; i <= num ; i ++) {
            System.out.println(i);
        }
    }
}
