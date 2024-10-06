package homework_10;

// Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
// Найдите максимальный элемент массива и его индекс.

public class Task4Star {

    public static void main(String[] args) {

        int[] numbers = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};

        int max = numbers[0];
        int maxFirst = 0;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
                maxFirst = i;

            }

        }
        System.out.print("Maximum element is " + max + " and maximum index is " + maxFirst);
    }
}
