package blog_part03;

import java.util.Scanner;

public class ForEachExample {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        int [] arr = new int [value];

        for (int i = 0 ; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        for (int count: arr) {
            System.out.println("result :" + count);
        }
    }
}
