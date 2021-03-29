package classExample;

class cbvTest3 {
    int value;

    cbvTest3(int value) {
        this.value = value;
    }

    private static void swap(cbvTest3 a, cbvTest3 b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    public static void main(String args[]) {
        cbvTest3 a = new cbvTest3(1);
        cbvTest3 b = new cbvTest3(2);

        System.out.println("a => " + a.value);
        System.out.println("b => " + b.value);

        swap(a, b);

        System.out.println("------- swap 후 -------");

        System.out.println("a => " + a.value);
        System.out.println("b => " + b.value);
    }
}