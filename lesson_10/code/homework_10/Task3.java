package homework_10;

//Создайте массив из 20 целых чисел в интервале от 10 до 30.
// Выведите массив на печать.
// Поменяйте местами первый и последний элементы массива и снова выведите массив на печать.

public class Task3 {

    public static void main(String[] args) {

        int[] numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
        26, 27, 28, 29};

        System.out.println("Version 1: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        numbers[0] = numbers[0] + numbers[numbers.length - 1];
        numbers[numbers.length-1] = numbers[0] - numbers[numbers.length - 1];
        numbers[0] = numbers[0] - numbers[numbers.length-1];

        System.out.println("Version 2: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

}
