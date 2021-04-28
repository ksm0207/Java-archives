package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BaekJoon10814Re {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        // 행 정수
        int size = Integer.parseInt(br.readLine());

        // 행 열 배열 생성
        String [][] array = new String[size][2];


        for (int i = 0 ; i < size ; i ++) {
            st = new StringTokenizer(br.readLine(), " ");
            // 나이 저장
            array[i][0] = st.nextToken();
            // 이름 저장
            array[i][1] = st.nextToken();
        }
        Arrays.sort(array, new Comparator<String[]>() {
            @Override
            public int compare(String[] age1, String[] age2) {
                // compare 메소드 : 양의정수 , 0 , 음의정수 중 하나를 반환
                // 양의 정수 일 경우 객체의 위치를 바꿈
                // 0 을 return 할 경우 나이가 같다는 뜻이 됨
                // age2[0] - age1[0] 으로 계산
                return Integer.parseInt(age1[0]) - Integer.parseInt(age2[0]);
            }
        });
        for (int i = 0 ; i < size ; i ++) {
            sb.append(array[i][0]).append(" ").append(array[i][1]).append("\n");
        }
        System.out.println(sb);

    }
}
