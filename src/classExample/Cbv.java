package classExample;

public class Cbv {

    int i;

    public Cbv(int i) {
        this.i=i;
    }


    public static void swap(Cbv c , Cbv c2){
        int change = c.i; // 1

        c.i = c2.i;; // 1 -- 2
        c2.i = change;  // 2 -->1
    }

    public static void main(String[] args) {

        Cbv c = new Cbv(1);
        Cbv c2 = new Cbv(2);

        System.out.println(c.i);
        System.out.println(c2.i);

        swap(c,c2);

        System.out.println(c.i);
        System.out.println(c2.i);






    }
}
