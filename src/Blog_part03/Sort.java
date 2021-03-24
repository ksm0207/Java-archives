package Blog_part03;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        int [] arr = new int [value];

        System.out.println("입력한 정수의 개수 : " + value);

        for (int i = 0; i < arr.length ; i ++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("정렬 전");
        for (int s : arr){
            System.out.println(s);

        }
        Arrays.sort(arr);

        System.out.println("정렬 후");
        for ( int s : arr){
            System.out.println(s);
        }
    }
}
