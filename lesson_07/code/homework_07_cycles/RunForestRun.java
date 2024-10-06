package homework_07_cycles;

// В первый день спортсмен пробежал s километров,
// а затем он каждый день увеличивал пробег на 10 % от предыдущего значения.
// Определите номер того дня, на который пробег спортсмена составит не менее target километров.
// Программа получает на вход действительные числа s и target и должна вывести одно натуральное число.

import java.util.Scanner;

public class RunForestRun {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first running in km: ");
        int s = scanner.nextInt();
        System.out.println("Enter the target of running in km: ");
        int target = scanner.nextInt();
        int days = 1;

        while (s < target){
            s += s * 0.10;
            days++;

        }

        System.out.println("Running will be reach at least: " + target + "km per day: " + days);


    }
}
