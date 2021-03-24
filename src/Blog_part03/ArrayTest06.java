package Blog_part03;

public class ArrayTest06 {
    public static void main(String [] args){
        int [][] arr = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
        for (int i = 0 ; i < arr.length ; i++) {
            for (int j = 0 ; j < arr[i].length ; j ++) {
                System.out.println(i + "행" + j + "열" + "=" + arr[i][j]);
            }
        }
    }

}
