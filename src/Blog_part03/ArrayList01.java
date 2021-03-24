package Blog_part03;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String [] args){

        ArrayList<String> list = new ArrayList<String>();

        list.add("월");
        list.add("화");
        list.add("수");
        list.add("목");
        list.add("금");
        list.add("토");
        list.add("일");

        list.remove(0);

        for (int i = 0; i < list.size() ; i ++ ) {
            System.out.println(list.get(i));
        }

    }
}
