package backjoon05String2;

import java.util.Scanner;

public class B13163 {
    public static void main(String[] args) throws Exception {
        // Git - 백준 13163 닉네임에 갓 붙이기 ( 분류 : 문자열 )
        // Hint : replace(a , b) -> a를 b로 바꿔라
        //        replaceAll(a, b) -> 해당 문자열에서 모든 a를 b로 바꿔라
        Scanner scan = new Scanner(System.in);

        int value = scan.nextInt();

        String [] name = new String[value];

        scan.nextLine();

        // 1. 이름 저장
        for (int i = 0 ; i < value ; i ++) {
            name[i] = scan.nextLine();
        }

        // 2. 첫 이름을 저장 할 변수
        String temp = "";

        // 3. 닉네임 처리
        for (int i = 0 ; i < value ; i ++) {

            // 3-1 닉네임 읽기
            for (int j = 0 ; j < name[i].length() ; j ++) {

                // name[i].charAt(j) == 닉네임에 공백이 들어왔을 때 처리.
                if (name[i].charAt(j) == ' ') {

                    // 첫 이름 저장
                    int initFirst = j; // length() == 3
                    j = 0;

                    for (int k =  j ; k < initFirst ; k ++) {
                        temp += name[i].charAt(k);
                        System.out.println(temp);
                    }
                    name[i] = name[i].replace(temp,"god");
                    name[i] = name[i].replaceAll(" ","");
                    temp = "";
                    break;
                }
            }
        }
        for (int i = 0 ; i < value ; i ++) {
            System.out.println(name[i]);
        }

    }
}
