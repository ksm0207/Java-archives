package backjoon03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjoon03 {
    public static void main (String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int [10];

        int ABC = Integer.parseInt(br.readLine()) *
                  Integer.parseInt(br.readLine()) *
                  Integer.parseInt(br.readLine());

        String str = String.valueOf(ABC);

        // str.length() = 170 373 00 length
        for (int i = 0 ; i < str.length(); i ++) {
            arr[str.charAt(i) - '0'] ++;

//            System.out.println(arr[str.charAt(i)-'0']++);

//            System.out.println(str.charAt(i));
            System.out.println(str.charAt(i) -'0'+ "  >>>>>>>>>>>>  " + arr[str.charAt(i) -'0'] + "\n"  );
        }
        for (int res : arr) {
            System.out.println(res);
//            System.out.println("arr[0] Result  ================> "+arr[0]);
        }
    }
}
// 150 266 427
