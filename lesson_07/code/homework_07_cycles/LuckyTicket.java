package homework_07_cycles;

// Вводится шестизначное число (номер автобусного билета).
// Определите, является ли этот билет "счастливым" (сумма первых трех цифр равна сумме трех последних цифр).

import java.util.Scanner;

public class LuckyTicket {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a ticket number (6 numbers): ");
        int ticketNum = scanner.nextInt();

        int sum1 = 0;
        int sum2 = 0;

        while (sum1 > 0){
            sum1 += sum1 % 10;
            sum1 /= 10;
        }

        while (sum2 > 0){
            sum2 += sum2 % 10;
            sum2 /= 10;
        }
        if (sum1==sum2){
            System.out.println("Ticket is lucky!");
        } else {
            System.out.println("Ticket isn't lucky...");
        }

    }
}
