package Blog_part04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;

public class ExampleRun {
    String hamBurger = "";
    String potato = "";
    String coke ="";

public static void main(String [] args) throws IOException {

    ExampleRun ex = new ExampleRun();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    for (int i = 0 ; i < 1 ; i ++) {
        ex.hamBurger = br.readLine();
        ex.potato = br.readLine();
        ex. coke = br.readLine();
    }
    System.out.println(ex.hamBurger + " " + ex.potato + " " + ex.coke);

    }
}
