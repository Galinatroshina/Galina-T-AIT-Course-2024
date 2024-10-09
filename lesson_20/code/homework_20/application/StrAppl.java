package homework_20.application;

// Напишите программу, которая запрашивает у пользователя строку, содержащую целые числа, и выводит сумму всех этих введенных чисел. Используйте классы-обёртки для преобразования строк в соответствующие примитивы.

import java.util.Scanner;

public class StrAppl {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // запрос чисел у пользователя
        System.out.println("Input integers separated by spaces: ");

        String str  = scanner.nextLine(); // чтение строки

        String[] numbers  = str.split(" "); // Разделнние строки на числа по пробелам

        int sum  = 0;

        for (String number : numbers){
            sum +=Integer.parseInt(number); // из строки в число и плюс к сумме
        }
        System.out.println("Value of numbers: " + sum);

    } //end of main
} //end of class
