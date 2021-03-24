package Blog_part03;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sort02 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        Integer [] arr = new Integer[value];

        for (int i = 0 ; i < arr.length; i ++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("내림차순 정렬 전");
        for (int s : arr){
            System.out.println(s);
        }

        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println("내림차순 정렬 후");
        for (int s : arr){
            System.out.println(s);
        }
    }
}
