package homework;

// Метод вычисляющий периметр прямоугольника по двум сторонам;
// В методе main вызвать вышеуказанные методы с различными аргументами, и результаты вывести в консоль

public class Rectangle {

    public static void main(String[] args) {

        double l = 10;
        double w = 25;

        double p = perimeterOfRectangle(l, w);
        System.out.println("Length of Rectangle = " + l);
        System.out.println("Width of Rectangle = " + w);
        System.out.println("Perimeter of Rectangle = " + p);


    } // end of main

    public static double perimeterOfRectangle (double l, double w){
        double res = l + w;
        double res2 = res * 2;
        return res2;

    }


} // end of class
