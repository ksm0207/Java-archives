package backjoon04;

public class BackJoon01 {

}

class Test{
    long sum (int [] a) {

        long result = 0 ;

        for(int i = 0 ; i < a.length; i ++) {

            result += a[i];
        }
        return result;

    }
}