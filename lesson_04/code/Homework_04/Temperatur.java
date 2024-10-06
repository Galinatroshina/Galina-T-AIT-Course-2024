package Homework_04;

// Напишите метод, который переводит градусы Цельсия в градусы по Фаренгейту.
// Формулу пересчета найти в Интернете. Вызовите метод в main.

public class Temperatur {

    public static void main(String[] args) {

        double degree = 45;
        double fahrenheit = changeCToF(degree);
        System.out.println("Fahrenheit:" + fahrenheit + " degrees");


    } // end of main

    private static double changeCToF(double degree){
        double a = 9/5;
        double b = 32;
        return a * degree + b;

    }

} // end of class
