package baekjoonMath2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1934Re {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int count = Integer.parseInt(br.readLine());
        int [] arr = new int[count];
        int res = 0 ;

        for (int i = 0 ; i < count ; i ++) {
            st = new StringTokenizer(br.readLine() , " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            res = gcd(A,B);
            arr[i] = A * B / res ;
        }
        for (int result : arr) {
            System.out.println(result);
        }
    }
    public static int gcd (int a , int b) {
        if (b  == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
