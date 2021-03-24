package Blog_part02;

public class BreakTest {
    public static void main ( String [] args){

        for (int i = 0 ; i <= 10 ; i ++) {
            System.out.println(i +"실행중");

            if(i == 3){
                System.out.println("i 는 " + i + " 번째에 멈추었네요");
                break;
            }
        }
    }
}
