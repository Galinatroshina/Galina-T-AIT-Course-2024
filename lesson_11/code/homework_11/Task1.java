package homework_11;

//Задан массив целых чисел: 65, 37, 51, -17, 73, -41, 52, 56, -55, 83.
// Найдите максимальный элемент массива и его индекс.
// Поставьте этот элемент в начало массива вместо имеющегося.

public class Task1 {

    public static void main(String[] args) {

        int[] array = {65, 37, 51, -17, 73, -41, 52, 56, -55, 83};

        int maxOfArray = array[0]; // guess
        int indexOfMaxElement = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxOfArray){
                maxOfArray = array[i];
                indexOfMaxElement = i;
            }

        }
        System.out.println("Max element of array = " + maxOfArray + ", index of max element = " + indexOfMaxElement);

        int temp = array[indexOfMaxElement];
        array[0] = array[indexOfMaxElement];
        array [indexOfMaxElement] = temp;

        System.out.println(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();

    }
}
