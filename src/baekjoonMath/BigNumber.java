package baekjoonMath;

import java.math.BigInteger;
import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        BigInteger x = scan.nextBigInteger();
        BigInteger y = scan.nextBigInteger();
        BigInteger sum = x.add(y);
        System.out.println(sum);
    }
}
