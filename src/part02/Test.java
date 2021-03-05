package part02;

public class Test {
    public static void main(String [] args){

        int value = 100;

        if(value >= 80){ //   (1)
            if(value >=90){// (2)
                System.out.println("Up");
            }else{         // (3)
                System.out.println("Down");
             }
        }
    }
}
