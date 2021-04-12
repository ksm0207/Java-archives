package BlogPost;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumber {

    // 1. InputMismatchException 예외처리

    public void print(){
        Scanner scan = new Scanner(System.in);
        int value = 0;
        while (true){
            try {
                System.out.println("try 블럭에 오신것을 환영합니다.");
                System.out.println("정수를 입력해볼까요?");
                value = scan.nextInt();
                System.out.println("잘하셨습니다 입력한 값은 " +value + " 입니다 ");
                break;

            }catch (InputMismatchException errorRes) {
                System.out.println("-----------------------------");
                System.out.println("try 블럭에 예외가 발생했습니다. ");
                System.out.println("정수만 입력해주세요.");
                scan = new Scanner(System.in);
                System.out.println(errorRes); // 23 ~ 24 에러메시지 출력
                System.out.println(errorRes.getClass().getName() + " 예외처리된 내용 : " + errorRes.getMessage());
                System.out.println("-----------------------------\n");

            } // end of try / catch
        } // end of while
    } // end of InputNumber Class
    
    public static void main(String[] args) throws Exception {
        InputNumber in = new InputNumber();
        in.print();
    }
}
