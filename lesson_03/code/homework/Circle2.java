package homework;

// Написать аппликацию (класс) с метод вычисляющий площадь круга по его радиусу;

public class Circle2 {

    public static void main(String[] args) {

        double PI = 3.14;
        double r = 5;

        double s = areaOfCircleMethod(r);
        System.out.println("Radius of Circle = " + r);
        System.out.println("Area Of Circle with radius " + r + " = " + s);

    } // end of main

    public static double areaOfCircleMethod (double r){
        return Math.PI*r*r;

    } // end of method


} // end of class
