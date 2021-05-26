package backjoon05String;

import java.util.Scanner;

public class BackJoon03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int [] arr = new int[26];

        for (int i = 0 ; i < arr.length ; i ++) {
            arr[i] = -1;
        }
        // beckjoon
        String S = scan.nextLine();

        for (int i = 0 ; i < S.length() ; i ++) {
            char resValue = S.charAt(i);
            System.out.println(resValue);

            if ( arr[resValue - 'a'] == -1 ) {
                arr[resValue - 'a'] = i;
            }
        }
        for (int res : arr){
            System.out.println(res + " ");
        }
    }
}
