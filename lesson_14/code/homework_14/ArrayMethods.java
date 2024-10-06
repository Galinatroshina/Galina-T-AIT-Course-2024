package homework_14;



public class ArrayMethods {



// bubble sort
//- сравниваем всегда 2 соседних элемента, переставляем их местами, если они расположены не в порядке возрастания
//- цикл должен идти слева направо
//- упорядоченные элементы выключаются из цикла


    public static void bubbleSort(int[] array){

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length -1 - i; j++) {
                if(array[j] > array[j + 1]){ // array[i] левый элемент и array[i + 1] правый элементб если левый больше правого, то меняем (swap)
                    int temp = array[j];
                    array[j] = array [j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    //--------------------------------------------------
       //array turn around, это переворот массива в другую сторону, это не сортировка
    // step 1 method swap
    public static void swap(int[] array,int i, int j){ // метод который позволяет поменять местами любые индексы в массиве
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void reverseArray(int[] array){ // метод который разворачивает массив
        for (int i = 0, j = array.length -1; i < j; i++, j--) { // int i = 0 - левый индекс, array.length -1 - правый индекс минус 1,
            swap(array, i, j); // обращение к методу свап наверху
        }
    }












    //=====================================================

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


