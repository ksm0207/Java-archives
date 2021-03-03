package expression;

public class TypeConversion {
    public static void main(String[] args){

        int a = 0;
        double b = 0.0;

        b = 5/4;
        System.out.println(b);

        b = (double) 5/4;
        System.out.println(b);

        a = (int) 1.3 + (int) 1.8;
        System.out.println(a);

        int value =0;
        double d_value = 12.5;

        value = (int) d_value;

        System.out.println(value);


    }
}
