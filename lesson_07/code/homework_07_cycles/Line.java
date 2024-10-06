package homework_07_cycles;

// Программа получает на вход строку и число повторений этой строки.
// Программа должна вывести эту строку нужное количество раз.
// Пример: строка - молоко, кол-во раз 3 молоко молоко молоко

import java.util.Scanner;

public class Line {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input line: ");
        String line = scanner.nextLine();
        System.out.println("Input quantity: ");
        int countLine = scanner.nextInt();
        int count = 0;

        while (count < countLine){
            System.out.println(line);
            count++;

        }

    }
}
