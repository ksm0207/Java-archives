package expression;

public class StringBufferTest {
    public static void main(String [] args){

        StringBuffer str = new StringBuffer();
        StringBuffer str2 = new StringBuffer();

        str.append("World");
        str.insert(0," Hello");
        System.out.println(str.toString());

        str2.append("Hello World -Kim-");
        System.out.println(str2.substring(0,5));
    }
}
