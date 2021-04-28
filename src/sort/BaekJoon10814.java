package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BaekJoon10814 {
    public static void main(String[] args)  throws Exception  {

        // 1. (Git) 단계별 : 정렬 - 10814 나이 정렬하기


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int size = Integer.parseInt(br.readLine());

        String [][] array = new String[size][2]; // N행 2열

        for (int i = 0 ; i < size ; i ++) {
            st = new StringTokenizer(br.readLine()," ");
            array[i][0] = st.nextToken(); // 나이 입력
            array[i][1] = st.nextToken(); // 이름 입력
//            System.out.println(array[i][0]);
//            System.out.println(array[i][1]);
        }

        Arrays.sort(array, new Comparator<String[]>() {
            // 나이 정렬
            @Override
            public int compare(String[] age1, String[] age2) {
                // return 0이 된다면 나이가 같다는 것 이므로 자연스레 입력 순 으로 정렬
                System.out.println("Return ");
                System.out.println("Age1[0] ===== > " +age1[0]);
                System.out.println("Age2[0] ==== > " +age2[0]);
                System.out.println(Integer.parseInt(age1[0]) - Integer.parseInt(age2[0]));
                // ----------------------
                // age1[0] -- > 두번째로 입력한 정수 저장
                // age2[0] -- > 첫번째로 입력한 정수 저장

                // 계산 식 : age2[0] - age1[0]

                // age1[0] 59 kim
                // age2[0] 60 kim
                // age[2] - age[1] = 1 ( 60 - 59 )
                // ----------------------
                return Integer.parseInt(age1[0]) - Integer.parseInt(age2[0]);
            }
        });

        // 출력
        for (int i = 0 ; i < size ; i ++) {
            sb.append(array[i][0]).append(' ').append(array[i][1]).append("\n");
        }
        System.out.println(sb);

    }
}
