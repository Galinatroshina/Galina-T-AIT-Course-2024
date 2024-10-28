package homework_29.car_garage.ait.cars.test;

import homework_29.car_garage.ait.cars.dao.Garage;
import homework_29.car_garage.ait.cars.dao.GarageImpl;
import homework_29.car_garage.ait.cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


class GarageImplTest {

    private Garage garage;
    private Car[] cars;

    @BeforeEach
    void setUp() {

        garage = new GarageImpl(5);
        cars = new Car[4];
        cars[0] = new Car("Number1", "Model1", "Company1", 1.5, "Red", 2021);
        cars[1] = new Car("Number2", "Model2", "Company1", 2.5, "Green", 2022);
        cars[2] = new Car("Number3", "Model1", "Company2", 1.5, "Red", 2024);
        cars[3] = new Car("Number4", "Model4", "Company2", 2.0, "Green", 2021);

        // TODO add cars to garage
        for (int i = 0; i < 4; i++) {
            garage.addCar(cars[i]);
        }

    }


    @Test
    void  sortCarsByAgeTest() {
        System.out.println("------------List of cars as is------------");
        printCarsTest(); // печать как есть
        Arrays.sort(cars); //сортировка
        System.out.println("------------List of cars sorted by age------------");
        printCarsTest(); // печатаем

    }

    @Test
    void addCarTest() {

    }

    @Test
    void removeCarTest() {

    }

    @Test
    void findCarByRegNumberTest() {

    }

    @Test
    void findCarsByModelTest() {
        Car[] expected = {cars[0], cars[2]};
        Car[] actual = garage.findCarsByModel("Model1");
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByCompanyTest() {

    }

    @Test
    void findCarsByEngineTest() {

    }

    @Test
    void findCarsByColorTest() {

    }

    @Test
    void sizeTest(){
        assertEquals(4, garage.size());
    }

    @Test
    void printCarsTest(){
        garage.printCars();
    }



}// end of class
