package homework_13;

import static homework_13.ArrayCoinMethod.flipCoin;

public class ArrayCoinApp {

    public static void main(String[] args) {

        boolean[] flips = new boolean[100];
        int Orel = 0;
        int Reshka = 0;
        int i = 0;
        while (i < flips.length){
            flips[i] = flipCoin();
            if (flips[i]){
                Orel++;
            } else {
                Reshka++;
            }
            i++;
        }
        double sideOrel = (double) Orel / flips.length;
        double sideReshka = (double) Reshka / flips.length;

        System.out.println("Orel: " + Orel + " probability: " + sideOrel);
        System.out.println("Reshka: " + Reshka + " probability: " + sideReshka);

    } // end of main

}
