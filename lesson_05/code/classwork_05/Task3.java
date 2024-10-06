package classwork_05;

// Написать метод, возвращающий максимальное из двух целых чисел.
//  Реализовать метод, который возвращает максимальное из трех целых чисел. Числа задаются в программе.
//  Написать метод, возвращающий максимальное из двух целых чисел, использовать тернарный оператор.

public class Task3 {

    public static void main(String[] args) {

        // call method
        int a = 45;
        int b = 34;

        int max = maximum(a, b);
        System.out.println("Maximum = " + max);


    }

    // method
    private static int maximum (int a, int b){
        int max;
        if (a > b){
            max = a;
        } else {
            max = b;
        }
        return max;
    }



}
