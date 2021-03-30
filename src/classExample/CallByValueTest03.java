package classExample;

class CallByValueTest03 {
    int value;

    CallByValueTest03(int value) {
        this.value = value;
    }

    private static void swap(CallByValueTest03 a, CallByValueTest03 b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    public static void main(String args[]) {
        CallByValueTest03 a = new CallByValueTest03(1);
        CallByValueTest03 b = new CallByValueTest03(2);

        System.out.println("a => " + a.value);
        System.out.println("b => " + b.value);

        swap(a, b);

        System.out.println("a => " + a.value);
        System.out.println("b => " + b.value);
    }
}