package homework_08;

// Распечатайте все натуральные числа меньшие 200 и кратные 13. Используйте циклы while и do while.

public class PrimeNumbers {

    public static void main(String[] args) {

        int num = 13;

        while (num < 200){
            System.out.println(num);
            num += 13;
        }


    }
}
