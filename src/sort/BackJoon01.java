package sort;
import java.util.*;

public class BackJoon01 {
    public static void main(String[] args) {
        // 1. 수 정렬하기 - 2750번

        Scanner scan = new Scanner(System.in);
        Set<Integer> set = new HashSet<Integer>();

        int count = scan.nextInt();
        int [] arr = new int[count];

        for (int i =0 ; i < arr.length; i ++) {
            arr[i] = scan.nextInt();
            set.add(arr[i]);
        }
        List<Integer> list = new ArrayList<Integer>(set);
        Collections.sort(list);

        for (int res : list ){
            System.out.println(res);
        }
    }
}
