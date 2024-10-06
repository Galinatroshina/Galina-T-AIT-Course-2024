package Homework_04;

// Напишите методы для конвертации валюты:
// евро в доллары США
// евро в британские фунты
// евро в китайские юани и проверьте их работу, вызвав их в main.

public class Exchange {

    public static void main(String[] args) {

 // перевод евро в доллары

        double cash = 1000; // euro
        double dollars =  exchangeEuroToDollars(cash);
        System.out.println("Dollars: " + dollars);

// евро в британские фунты

        double money = 550; // euro
        double gbp =  exchangeEuroToGBP(money);
        System.out.println("GBP: " + gbp);

// евро в китайские юани

        double geld = 1200; // euro
        double yuan =  exchangeEuroToYuan(geld);
        System.out.println("Renminbi Yuan: " + yuan);
    }

    private static double exchangeEuroToYuan(double geld){
        double rate = 7.87;
        return geld*rate;
    }

    private static double exchangeEuroToGBP(double money){
        double rate = 0.84;
        return money*rate;
    }

    private static double exchangeEuroToDollars(double cash){
        double rate = 1.11;
        return cash*rate;

    }
}

