package classwork_18.computer_shop;
//Создать несколько экземпляров каждого класса.
//
//Какой общий объем памяти у всех устройств на складе?
//Какова общая стоимость всех устройств на складе?

import classwork_18.computer_shop.model.Computer;
import classwork_18.computer_shop.model.Laptop;

public class ShopAll {
    public static void main(String[] args) {

        Computer computer = new Computer("i7", 8, 256, "Acer", 1200);
        System.out.println(computer);

        Laptop laptop = new Laptop("M1", 8, 256, "Apple AirBook", 2200, 14, 1.5, 32, "black" );

        //кладем объекты в массив, чтобы выполнить второй задание
        Computer[] computers = new Computer[5]; // типа 3 компа и 2 ноута
        computers[0] = new Computer("i7", 8, 256, "Acer", 1200);
        computers[1] = new Computer("i5", 16, 256, "Mac", 1500);
        computers[2] = new Computer("Intel", 8, 256, "HP", 2000);
        computers[3] = new Laptop("M1", 8, 256, "Apple", 1200, 14, 1.5, 32, "white");
        computers[4] = new Laptop("M2", 8, 256, "Apple", 2000,16, 1.8, 32, "silver");

        int totalSsd = 0;
        for (int i = 0; i < computers.length; i++) {
            totalSsd += computers[i].getSsd();
        }
        System.out.println("Total SSD: " + totalSsd);

        double totalPrice = 0;
        for (int i = 0; i < computers.length; i++) {
            totalPrice += computers[i].getPrice();

        }
        System.out.println("Total price: " + totalPrice);

        System.out.println("--------------");

        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i]); // выводит инфу по всем компам в массиве

        }
        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i].getBrand());

        }
    }
}
