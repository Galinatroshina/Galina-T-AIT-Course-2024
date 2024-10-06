package homework_06;

// Задача 1. Напишите программу расчета выдачи денег работнику с учётом надбавки за стаж,
// если базовая зарплата 500$. За 3 года работы надбавка 10%, за 5 лет работы надбавка 50%,
// за 10 лет работы надбавка 100%, за 15 лет работы надбавка 150%. Сколько лет проработал работник вводится с клавиатуры.

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {

        double salary = 500;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input how many years the employee has worked: ");
        double years = scanner.nextDouble();

        double premium = 0;

        if (years >= 3){
            premium = 10;
        } else if (years >= 5) {
            premium = 50;
        } else if (years >= 10) {
            premium = 100;
        } else if (years >= 15) {
            premium = 150;
        }

        double totalSalary = salary + (salary * premium / 100);
        System.out.println("Final salary with premium: " + totalSalary);

    }


}
