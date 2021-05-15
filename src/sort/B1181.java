package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class B1181 {
    public static void main(String[] args)  throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String [] arr = new String[N];

        for (int i = 0 ; i < N ; i ++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                if (o1 == o2) {
                    return o1.compareTo(o2);
                }else {
                    return o1.length() - o2.length();
                }
            }
        });
        System.out.println(arr[0]);
        for (int i = 1; i < N; i++) {
            // 중복되지 않는 단어만 출력
            if (!arr[i].equals(arr[i - 1])) {
                System.out.println(arr[i]);
            }
        }
    }
}
