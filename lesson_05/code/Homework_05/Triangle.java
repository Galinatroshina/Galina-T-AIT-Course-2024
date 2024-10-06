package Homework_05;

// Задать в программе три стороны треугольника.
// Проверить выполнимость неравенства треугольника - любая из сторон должна быть меньше суммы двух других.
// Сообщить результат - существует или нет треугольник с заданными сторонами.

public class Triangle {

    public static void main(String[] args) {

        double a = 15;
        double b = 2;
        double c = 3;

        if( a + b > c ){
            System.out.println("This triangle is valid");

        } else {
            System.out.println("This triangle is not valid");
        }

        if (a + c > b){
            System.out.println("This triangle is valid");

        } else {
            System.out.println("This triangle is not valid");
        }

        if (b + c > a){
            System.out.println("This triangle is valid");

        } else {
            System.out.println("This triangle is not valid");
        }


    }

    }






