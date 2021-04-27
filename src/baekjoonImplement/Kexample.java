package baekjoonImplement;

import java.util.Arrays;

public class Kexample {

    public int [] solution(int[] array , int[][] commands){

        // commnads 길이를 받는다 0 0 0
        int [] answer = new int[commands.length];

        for (int i = 0 ; i < commands.length ; i ++) {

            // commands[i][0] = > 2 4 1 , [i][0] -1 = > 1 3 0
            int [] save = Arrays.copyOfRange(array , commands[i][0]-1 , commands[i][1]);
            Arrays.sort(save);

            answer[i] = save[commands[i][2]-1];

            for (int res : answer) {
                System.out.println(res);
            }


        }
        return answer;
    }

    public static void main(String[] args) {
        Kexample ex = new Kexample();
        int [] array = {1,5,2,6,3,7,4};
        int [][] commands = {
                {2,5,3},
                {4,4,1},
                {1,7,3}
        };
        ex.solution(array,commands);
    }
}
