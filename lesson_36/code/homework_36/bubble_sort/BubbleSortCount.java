package homework_36.bubble_sort;

import java.util.Random;

public class BubbleSortCount {

    public static int bubbleSort(int[] array) {
        int operationCount = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int b = 0; b < array.length - 1 - i; b++) {
                operationCount++;
                if (array[b] > array[b + 1]) {
                    int elements = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = elements;
                }
            }
        }
        return operationCount;
    }

    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1001); // заполняем массив
        }
        return array;
    }

    public static void main(String[] args) {
        int[] sizes = {10, 100, 1000};
        for (int size : sizes) {
            int[] array = generateRandomArray(size);
            int operationCount = bubbleSort(array);
        }
    }


}
