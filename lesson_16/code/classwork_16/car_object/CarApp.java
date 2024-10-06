package classwork_16.car_object;

import classwork_16.car_object.model.Car;

public class CarApp {

    public static void main(String[] args) {

        Car myCar = new Car("VW", 2014, 15000, "Silver", false); //create objects

        myCar.toString();
        System.out.println(myCar);

        //двигаем объект
        myCar.move();
        myCar.stop();

    }
}
