package classExample;

public class CallByValueTest04 {

    int i;

    public CallByValueTest04(int i) {

        this.i = i;
    }

    static void swap(CallByValueTest04 cbv, CallByValueTest04 cbv2){
        int temp = cbv.i;
        cbv.i = cbv2.i;
        cbv2.i = temp;
    }

    public static void main(String [] args){

        // Start Call by Value
        CallByValueTest04 cbv = new CallByValueTest04(1);
        CallByValueTest04 cbv2 = new CallByValueTest04(2);

        System.out.println(cbv.i);
        System.out.println(cbv2.i);
        // end of Call by Value

        // Start reference
        swap(cbv,cbv2);

        System.out.println(cbv.i);
        System.out.println(cbv2.i);


    }
}
