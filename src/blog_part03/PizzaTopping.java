package blog_part03;


import java.util.Scanner;

public class PizzaTopping {
    public static void main ( String [] args) {

        Scanner scan = new Scanner(System.in);
        String [] topping = {scan.nextLine()};

        for (int i = 0 ; i < topping.length ; i ++) {
            System.out.println(topping[i]);
        }
    }
}
