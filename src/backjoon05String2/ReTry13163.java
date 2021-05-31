package backjoon05String2;


import java.util.Scanner;

public class ReTry13163 {
    public static void main(String[] args)   {
        // 다시풀기
        // 문제 : 닉네임에 갓 붙이기 ( 분류 : 문자열 )
        // Hint : replace(a , b) -> a를 b로 바꿔라
        //        replaceAll(a, b) -> 해당 문자열에서 모든 a를 b로 바꿔라
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        String [] name = new String[count];

        scan.nextLine();

        for (int i = 0 ; i < count ; i ++) {
            name[i] = scan.nextLine();
        }

        String firstName = "";

        for (int i = 0 ; i < count ; i ++) {

            for (int j = 0 ; j < name[i].length(); j ++) {

                if (name[i].charAt(j) == ' ') {
                    int first = j;
                    j = 0;

                    for (int k = j ; k < first ; k ++) {
                        firstName += name[i].charAt(k);
                    }
                    name[i] = name[i].replace(firstName,"god");
                    name[i] = name[i].replaceAll(" ","");
                    firstName = "";
                    break;
                }
            }
        }
        for (int i = 0 ; i < count ; i ++) {
            System.out.println(name[i]);
        }
    }
}
