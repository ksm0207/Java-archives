package classExample;

public class CarRun {
    public static void main(String [] args) {

        Car car = new Car();

        car.color = "Blue";

        System.out.println("색상 :" + car.color);
        System.out.println("현재 기어 : " + car.changeGear(1));
        System.out.println("스피드 : "  +car.speedUp());


        System.out.println(car);



    }
}
