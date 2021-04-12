package BlogPost;

public class NullPointerException {

    public static void main(String[] args) {

        Person p = null;
        if (p == null) {
            System.out.println("is Null");
            return ;
        }else{
            System.out.println(p.name);
        }

    }
    class Person {
        String name;
        int age;
    }
}
