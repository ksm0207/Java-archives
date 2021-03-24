package Blog_part03;

public class ArrayTest05 {
    public static void main(String [] args){

        System.out.println(sum(new int [] {10,20,30,40,50}));

    }
    public static int sum ( int [] arguments){

        int result = 0;

        for (int i = 0 ; i < arguments.length ; i ++) {
            result = result + arguments[i];
        }
        return result;
    }

}
