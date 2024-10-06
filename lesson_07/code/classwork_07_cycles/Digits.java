package classwork_07_cycles;

// Пользователь вводит натуральное число (целое, положительное).
//Выясните, сколько цифр в числе.

import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer number: ");
        int number = scanner.nextInt();
        int temp = number;

        int count = 0;

        while(number > 0){

            number = number / 10; // number - параметр цикла
            System.out.println(number);
            count++;



        }
        System.out.println("Digits in number " + temp + " are " + count);

    }
}
