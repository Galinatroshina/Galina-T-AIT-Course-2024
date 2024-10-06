package homework_14;

public class ArrayMethodsAppl {

    public static void main(String[] args) {

        // create array
       // int[] myArray = ArrayMethods.fillArray(0, 100, 10);


        // print array
      //  ArrayMethods.printArray(myArray);


        //sort array
      //  ArrayMethods.bubbleSort(myArray);


        //print array
     //   ArrayMethods.printArray(myArray);

        int[] newArray = ArrayMethods.fillArray(1, 20, 6); // создаем массив
        ArrayMethods.printArray(newArray); // печатаем массив
        ArrayMethods.reverseArray(newArray);// разворачиваем массив
        ArrayMethods.printArray(newArray); // печатаем развернутый



//       int[] myArray = ArrayMethods.fillArray(10, 20, 30);
        //       ArrayMethods.printArray(myArray);

        //        Scanner scanner = new Scanner(System.in);
        //       System.out.println("Input number for searching: ");
        //       int n = scanner.nextInt();

        //       boolean isInArray = ArrayMethods.searchInArray(myArray, n);
        //       System.out.println("Number" + n + " is in array: " + isInArray);


        //int [] myArray = {10, 20, 30, 40, 50};
        //System.out.println(ArrayMethods.linearSearch(myArray, 10));
        //System.out.println(ArrayMethods.linearSearch(myArray, 100));

        //System.out.println("---------------------------------------");

        //int index = ArrayMethods.binarySearch(myArray, -100);
        //System.out.println(index);

    }
}
