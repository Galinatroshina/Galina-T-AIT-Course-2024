package homework_08;

// Определение времени суток. Напишите программу, которая принимает на вход текущий час (от 0 до 23)
// и выводит приветствие в зависимости от времени суток (утро, день, вечер, ночь).

import java.util.Scanner;

public class DayNight {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an hour between 0 and 23: ");

        int hour = scanner.nextInt();

        switch (hour){
            case 0,1,2,3,23,24 -> System.out.println("Good Night!");
            case 4,5,6,7,8,9,10,11 -> System.out.println("Good Morning!");
            case 12,13,14,15,16 -> System.out.println("Good Day!");
            case 17,18,19,20,21,22 -> System.out.println("Good Evening!");
        }

    }
}
