package array_methods;

import java.util.Scanner;

import static array_methods.ArrayMethods.calculatePercent;

public class ArrayMethodsAppl {

    public static void main(String[] args) {

        int[] myArray = ArrayMethods.fillArray(10, 20, 30);

        ArrayMethods.printArray(myArray);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number for searching: ");
        int n = scanner.nextInt();

        boolean isInArray = ArrayMethods.searchInArray(myArray, n);
        System.out.println("Number" + n + " is in array: " + isInArray);

        double[] balance = {250, 500, 1000, 800};
        double balancePercent = 10;
        double[] newBalance = calculatePercent(balance, balancePercent);
        System.out.println("Print rest of money: " + balance);
    }
}
