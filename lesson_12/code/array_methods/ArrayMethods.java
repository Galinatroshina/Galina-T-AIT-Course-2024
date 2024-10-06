package array_methods;

//  - заполнение массива случайными целыми числами из интервала от a до b
//  - печать массива целых чисел
// - поиск элемента

//Задание 2.
// Дополните класс ArrayMethods методом calculatePercent, который получает массив данных
// об остатках на счетах пользователей банка и возвращает их с начисленными X процентами.
// Дополните класс ArrayMethods методом printArrayDouble(), который печатает массив данных типа double.

public class ArrayMethods {

    //fill array random numbers
    // a - left border, b - right border, n - quantity
    public static int[] fillArray(int a, int b, int n){
        int[] res = new int[n];
        for (int i = 0; i < res.length; i++) {
            res [i] = (int)(Math.random()*(b-a+1)+a);
        }
        return res;
    }

    //print array
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("---------------------------------");
    }

    //search in array
    public static boolean searchInArray(int[] array, int n){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n){
                return true;
            }

        }
        return false;
    }

    //rest in array

    public static double[] calculatePercent (double[] balance, double balancePercent){
        double[] newBalance = new double[balance.length];
        for (int i = 0; i < balance.length; i++) {
            newBalance[i] = balance[i] + (balance[i] * balancePercent / 100);
        }
        return newBalance;
    }


    }


