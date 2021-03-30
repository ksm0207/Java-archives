package Blog_part04;

public class OverlodingTest {

    void number(int num){
        System.out.println(num);
    }
    void number(int num , int num2){
        System.out.println(num * num2);
    }
    void number(int num , double num2){
        System.out.println(num + num2);
    }

    public static void main(String[] args) {
        OverlodingTest obt = new OverlodingTest();
        obt.number(10);
        obt.number(10,20);
        obt.number(10,3.14);
        obt.number(10,'a'); // 아스키코드 a = 97
    }
}