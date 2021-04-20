package backjoon05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon04Re {
    public static void main(String[] args)  throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String resStr = "";


        for (int i = 0 ; i < count; i ++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            for (int j = 0 ; j < S.length(); j ++){
                char oldChar = S.charAt((j));
                char newChar = '\0';
                resStr += new String(new char[start]).replace(newChar,oldChar);

//                res += new String(new char[repeat]).replace(newS, copyChar);
            }
        }
//        System.out.println(resStr);
    }
}
