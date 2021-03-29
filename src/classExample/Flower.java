package classExample;

public class Flower {

    String flowerMenu = "";
    String pos = "";
    int price;

    void print(){
        System.out.println(flowerMenu +
                           "\n" + "가격 : " + price + "원\n"+
                          "판매처 : " + pos);
    }

    public static void main(String [] args){

        Flower a = new Flower();
        a.flowerMenu = "장미";
        a.price = 3000;
        a.pos ="시민의숲 양재꽃시장";
        a.print();
    }
}
