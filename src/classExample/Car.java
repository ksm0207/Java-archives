package classExample;

public class Car {
    String color = "";
    int gear;
    int speed;

    void print(){
        System.out.println("Car[color = " + color + " , gear = " + gear + " , speed = " + speed + " ]");
    }

//    @Override
//    public String toString(){
//        return "Car[color = " + color + " , gear = " + gear + " , speed = " + speed + " ]";
//    }

    int changeGear(int g){
        gear = g;
        return gear;
    }

    int speedUp() {
        speed = speed + 10;
        return speed;
    }

    int speedDown(){
        speed = speed - 10;
        return speed;
    }

    public static void main(String [] args) {

        Car car = new Car();

        car.color = "Blue";

        System.out.println("색상 :" + car.color);
        System.out.println("현재 기어 : " + car.changeGear(1));
        System.out.println("스피드 : "  +car.speedUp());
        System.out.println("스피드 감소 : " + car.speedDown());

        car.print();

    }
}
