package Blog_part04;

public class AbstractExample extends Abstract {

    @Override
    void method1() {
        System.out.println("추상메소드 완성22");
    }

    public static void main(String [] args){

        AbstractExample aex = new AbstractExample();
        aex.method1();
        aex.method2();
    }
}
