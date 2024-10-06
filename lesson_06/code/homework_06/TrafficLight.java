package homework_06;

// Напишите программу для машины на светофоре.
// Что делать водителю, если горит красный, жёлтый или зелёный свет.
// Цвет светофора задается в программе, затем с клавиатуры.

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input color of light (green, yellow, red): ");

        String color = scanner.nextLine();

        switch (color){
            case "green":
                System.out.println("GREEN! You can ride!");
                break;
            case "yellow":
                System.out.println("YELLOW! Be ready to stop or ride.");
                break;
            case "red":
                System.out.println("RED! STOP!");
                break;
            default:
                System.out.println("Wrong input!");

        }
    }


}
