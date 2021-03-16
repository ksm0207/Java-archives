package blog_part03;

import java.util.Arrays;

public class SortExample {
    public static void main(String [] args){

        final int SIZE = 10;
        int random = 0;
        int [] arr = new int[SIZE];

        for (int i = 0 ; i < arr.length; i ++) {
            random = (int) (Math.random() * 100);
            arr[i] = random;
        }
        System.out.println("난수로 들어간 배열");
        for (int result : arr) {
            System.out.println(result);
        }
        Arrays.sort(arr);

        System.out.println("정렬 후 배열");
        for (int result : arr) {
            System.out.println(result);
        }
    }
}