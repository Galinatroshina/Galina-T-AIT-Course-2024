package homework_11;

// У стрелка есть 10 попыток поразить мишень. Смоделируйте 10 выстрелов с помощью датчика случайных чисел.
// Ответьте на вопрос, сколько очков набрал стрелок?
// Попал ли он хоть раз в центр мишени?

import java.util.Random;

public class Task2 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] shoots = new int[10]; //  массив для резулттатов
        int points = 0;


        for (int i = 0; i < shoots.length; i++) {
            int shoot = random.nextInt(11);
            shoots[i] = shoot;
            System.out.print(shoots[i] + " ");
            points = points + shoots[i];

            //  а можно shoots [i] = random andom.nextInt(11);


            }
        boolean center = false;
        for (int i = 0; i < shoots.length; i++) {
        if (shoots[i] == 10) {
            center = true;
        }

        }
        System.out.println();
        System.out.println("Total points: " + points);
        System.out.println("Hit the center: " + center);

    }

}
