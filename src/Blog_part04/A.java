package Blog_part04;

import java.io.Serializable;

public class A {

    public Serializable Number(int num , int num2){

        int a = num;
        int b = num2;
        String c = "";

        if (num == 10 && num2 == 10) {
            c = "Error";
            return c;
        }
        return a + b;
    }
}
