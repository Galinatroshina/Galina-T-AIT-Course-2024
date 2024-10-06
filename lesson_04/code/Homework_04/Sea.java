package Homework_04;

// Создайте метод, который пересчитывает морские мили в километры. 1 морская миля = 1852 метра.

public class Sea {

    public static void main(String[] args) {

        double miles = 100;
        double kilometer = milesToKilometers(miles);
        System.out.println(miles + " морских милей = " + kilometer + " киллометров");


    } // end of main

    private static double milesToKilometers(double miles){
        double meter = 1852;
        return miles*meter;

    }


} //end f class
