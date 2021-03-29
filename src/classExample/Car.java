package classExample;

public class Car {
    String color = "";
    int gear;
    int speed;

    @Override
    public String toString(){
        return "Car[color = " + color + " , gear = " + gear + " , speed = " + speed + " ]";
    }

   int changeGear(int g){
        gear = g;
        return gear;
    }

    int speedUp() {
        speed = speed + 10;
        return speed;
    }

    void speedDown(){
        speed = speed - 10;
    }


}
