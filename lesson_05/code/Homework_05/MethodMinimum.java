package Homework_05;

// Написать метод, возвращающий минимальное из двух целых чисел. Числа задаются в программе.

public class MethodMinimum {

    public static void main(String[] args) {

        // new method no boolean

        int number_1 = 205;
        int number_2 = 105;

        int min = minimum(number_1, number_2);
        System.out.println("Minimal number is: " + min);

    }

    // method no boolean
    public static int minimum(int n1, int n2){
        int min;
        if (n2 > n1){
            min = n1;

        } else {
            min = n2;
        }

        return min;
    }


}
