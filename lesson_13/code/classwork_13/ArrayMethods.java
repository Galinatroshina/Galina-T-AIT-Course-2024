package classwork_13;

//  - заполнение массива случайными целыми числами из интервала от a до b
//  - печать массива целых чисел
// - поиск элемента
// n - это элемент


public class ArrayMethods {

    // O (log(n))
    // binary search
    public static int binarySearch(int[] array, int n){
        int leftIndex = 0;
        int rightIndex = array.length -1;

        while (leftIndex <= rightIndex){
            int midIndex = (leftIndex + rightIndex) /2;
            if (array[midIndex] == n){
                return midIndex;
            } else if (n < array[midIndex]) {
                rightIndex = midIndex - 1; // правую часть надо выбросить
            } else {
                leftIndex = midIndex +1; // или отброситьлевую половину
            }
        }
        return - leftIndex -1;
    }

    // 0 (n) - чем больше элементов массива, тем дольше работает метод
    //linear search, return index (if element absent return -1)
    public static int linearSearch(int[]array, int n){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == n){
                return i; // go out from method 4ever
            }
        }
        return -1;
    }











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


