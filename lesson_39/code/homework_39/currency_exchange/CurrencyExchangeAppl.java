package homework_39.currency_exchange;
//Создайте enum с кодами валют и их текущими курсами к евро.
// Убедитесь, что в списке нет дублирующихся кодов валют.
// Выведите список валют и их курсов на экран.
// Реализуйте возможность для пользователя выбрать желаемую валюту, ввести ее количество и узнать, сколько он получит при обмене на евро.

import java.util.HashSet;
import java.util.Scanner;

public class CurrencyExchangeAppl {

    public enum Currency { USD(1.10), EUR(1.0), GBP (0.85);

        private final double rate;

        Currency(double rate) {
            this.rate = rate;
        }

        public double getRate() {
            return rate;
        }
    }

    public static void main(String[] args) {
        HashSet<Currency> currencies = new HashSet<>();
        currencies.add(Currency.USD);
        currencies.add(Currency.EUR);
        currencies.add(Currency.GBP);

        for (Currency currency : currencies){
            System.out.println("Available currencies and their rates to Euro: ");
            System.out.println("USD: " + currency.USD.getRate());
            System.out.println("EUR: " + currency.EUR.getRate());
            System.out.println("GBP: " + currency.GBP.getRate());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the currency: " );
        String code = scanner.nextLine();

        if (currencies.contains(Currency.valueOf(code))) {
            Currency currency = Currency.valueOf(code);

            System.out.println("Enter amount: ");
            double amount = scanner.nextDouble();

            double amountToEuro = amount / currency.getRate();
            System.out.println("In Euro: " + amountToEuro);
        } else {
            System.out.println("Only USD, EUR and GBP available.");
        }
    }
}
