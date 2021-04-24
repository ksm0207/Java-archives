package baekjoonImplement;

import java.util.Scanner;

public class Output11718 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 1. (Git) 단계별 : 구현 - 11718번 그대로 출력하기

        while(scan.hasNextLine()) {
            String str = scan.nextLine();
            if(str.isEmpty() || str.length() > 1000)
                break;
            System.out.println(str);
        }

        scan.close();
    }

}