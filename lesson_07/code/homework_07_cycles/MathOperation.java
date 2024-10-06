package homework_07_cycles;

// Вводится положительное целое число, найдите сумму его цифр. Пример: 1725, сумма цифр = 15

import java.util.Scanner;

public class MathOperation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Input positive full number: ");
        int number = scanner.nextInt();
        int count = 0;

        while (number > 0){
            count += number % 10; // увеличивает значение переменной на указанную величину
            number /= 10; // делит значение переменной
        }

        System.out.println("Sum of numbers: " + count);

    }
}
