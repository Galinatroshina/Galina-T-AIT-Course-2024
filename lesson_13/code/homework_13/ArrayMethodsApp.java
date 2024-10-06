package homework_13;

// 1. Write a method copyOfArray.
// The method takes as input an array of integers and an integer - the length of the new array newLength.
// The method must create a new array of length newLength.
// The elements from the input array must be copied to the new array:
// Example: Initial array: {0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> print {0, 1, 2}

import static homework_13.ArrayMethods.copyOfArray;

public class ArrayMethodsApp {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6};
        // int[] newArray = copyOfArray(array,3);
        System.out.println(ArrayMethods.copyOfArray(array, 3));


    }
}
