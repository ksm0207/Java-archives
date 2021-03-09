package part02;

public class ContinueExample {
    public static void main(String [] args) {

        for(int i = 0 ; i <= 30 ; i ++) {
            if ( i == 10 ) {
                System.out.println("Continue 발생 :: "+i);
                continue;
            }
            System.out.println(i);
        }

    }
}
