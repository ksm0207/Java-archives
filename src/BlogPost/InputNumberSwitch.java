package BlogPost;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumberSwitch {
    // 1. InputMismatchException 예외처리 Switch 사용

    public void print() {

        Scanner scan = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int z = 0;

        int state = 1;

        while (true){
            try {
                switch (state){
                    case 1:
                        System.out.println("X 값을 입력하십시오.");
                        x = scan.nextInt();
                        state =2;
                    case 2:
                        System.out.println("Y 값을 입력하십시오.");
                        y = scan.nextInt();
                        state =3;
                    case 3:
                        System.out.println("Z 값을 입력하십시오.");
                        z = scan.nextInt();
                        state =3;
                        System.out.print("X Y Z 합 : " + (x+y+z) );
                }
                break;
            }catch (InputMismatchException errRes){
                scan = new Scanner(System.in);
                System.out.println("예외 발생 !!");
                System.out.println(errRes.getClass().getName() + " " + errRes.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        InputNumberSwitch ins = new InputNumberSwitch();
        ins.print();

    }
}
