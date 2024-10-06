package classwork;

// Создайте массив и заполните его целыми числами от 1 до 20.

public class Task1 {

    public static void main(String[] args) {

        int[] numbers = new int[20]; //length = 20, but indexes from 0 till 19

        // numbers[0] - first element of array
        // numbers[19] or numbers[numbers.length-1] - last
        // numbers.length = 20

        // fill in
        for (int i = 0; i < numbers.length; i++){

            numbers[i] = i + 1;

        }

        //print array numbers
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

    }

}
