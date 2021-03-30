package Blog_part04;

public class Math {
    int add(int i){

        return i + i;
    }
    double add(double i){
        return i + i;
    }

    public static void main(String [] args){

        Math m = new Math();
        System.out.println(m.add(10));
        System.out.println(m.add(3.14));
    }
}