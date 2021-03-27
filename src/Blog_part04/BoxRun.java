package Blog_part04;

public class BoxRun {
    public static void main(String [] args){

        Box box = new Box();

        box.width =20;
        box.length=20;
        box.height=30;

        System.out.println("상자의 가로" + box.width);
        System.out.println("상자의 세로" + box.length);
        System.out.println("상자의 높이" + box.height);


    }
}
