package classwork_12;

//Смоделируйте бросок игрального кубика 20 раз. Подсчитайте, сколько раз выпала каждая грань?
//Проверьте, равны ли вероятности выпадений граней кубика?

import java.util.Random;

public class Dice {

    public static void main(String[] args) {

        Random random = new Random(); // инициировали объект для случайных чисел

        int[] toss = new int[20];

        // заполняем массив

        for (int i = 0; i < toss.length; i++) {
            // вызов датчика случайных чисел
            int n = random.nextInt(6) + 1; // диапазон от 0 до 5 +1, чтобы сдвинуть от 1 до 6. если выпадает 0, то плюс 1, значит 1. или например выпало 5, то плюс 1 6
            toss[i] = n;
            System.out.print(n + " ");
        }
        System.out.println();


        // переключаемся на результаты
        int[] res = new int[6];
        for (int i = 0; i < toss.length; i++) {
            int n = toss[i];
            switch (n){
                case 1 -> res[0]++;
                case 2 -> res[1]++;
                case 3 -> res[2]++;
                case 4 -> res[3]++;
                case 5 -> res[4]++;
                case 6 -> res[5]++;

            }

        }
        //рапсечатыаем результаты
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");

        }


    }
}
