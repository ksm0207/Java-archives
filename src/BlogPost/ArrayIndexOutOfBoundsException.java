package BlogPost;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {

    public void print(int j) {

        try {
            int [] arr = {1,2,3,4};
            System.out.println("Result : " + arr[j]);
        }catch(java.lang.ArrayIndexOutOfBoundsException error){
            System.out.println("Catch 발생");
            System.out.println("0 ~ 3 까지만 입력하십시오.");
            System.out.println(error.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("배열에 값을 넣어봅시다");
        ArrayIndexOutOfBoundsException arrException = new ArrayIndexOutOfBoundsException();
        Scanner scan = new Scanner(System.in);

        int val = scan.nextInt();
        arrException.print(val);
    }
}
