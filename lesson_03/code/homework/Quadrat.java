package homework;

// Написать аппликацию (класс) с методом вычисляющим площадь квадрата по его стороне;

public class Quadrat {

    public static void main(String[] args) {

        double a = 4;
        double b = 4;
        double area = a * b;

        System.out.println("Side of Quadrat a = " + a);
        System.out.println("Side of Quadrat b = " + b);
        System.out.println("Area of Quadrat with Sides " + a + b + " = " + area);

        area = areaOfQuadrat(a, b);
        System.out.println(area);


    } // end of main

    public static double areaOfQuadrat (double a, double b) {
        double res = a * b;
        return res;


    } // end of method


} //end of class
