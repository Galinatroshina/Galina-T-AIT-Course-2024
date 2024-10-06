package homework_10;

// Собрать в массив данные о дневной температуре в вашем городе да прошедшую неделю.
// Выведите на печать температуру, которая была во вторник и затем в четверг.
// Найти среднюю температуру за прошлую неделю.

public class Temperature {

    public static void main(String[] args) {

        int [] grad = {23, 23, 21, 20, 22, 19, 21};

        int sum = 0;

        for (int i = 0; i < grad.length; i++) {
            sum = sum + grad[i];

        }

        double averageGrad = (double) sum / grad.length;
        System.out.println("Average mark = " + averageGrad);

        System.out.println("Temperature on Tuesday was: " + grad[2]);
        System.out.println("Temperature on Thursday was: " + grad[4]);


    }
}
