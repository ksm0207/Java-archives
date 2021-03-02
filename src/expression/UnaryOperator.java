package expression;

public class UnaryOperator {
    public static void main(String [] args){
        int xValue = 1;
        int yValue = 1;

        int xEmpty = ++ xValue; // xValue 값이 사용되기 '전'에 증가됩니다
        int yEmpty = yValue ++; // yValue 값이 사용된 '후'에 증가됩니다

        System.out.println(xEmpty); // 2
        System.out.println(yEmpty); // 1
    }
}
