package homework;

// Величину 3-го угла треугольника по известным первым двум.

public class Triangle1 {

    public static void main(String[] args) {

       double s = 180;
       double a = 40;
       double b = 60;
       double angleC = s - a - b;


        angleC = angleOfTriangleC(s, a, b);

        System.out.println("All of angles = " + s);
        System.out.println("Angle a = " + a);
        System.out.println("Angle a = " + b);
        System.out.println("Angle C: Sum angles " + s + " - angle a " + a + " - angle b " + b + " = " + angleC);



    } // end of main

    public static double angleOfTriangleC(double a, double b, double s){
        double res = s - a - b;
        return res;


    }



} // end of class
