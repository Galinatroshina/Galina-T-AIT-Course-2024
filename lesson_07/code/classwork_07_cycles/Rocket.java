package classwork_07_cycles;

// Задача 2.
//Запустить обратный отсчет старта ракеты от 10 до 0.
//Последнее сообщение: "Поехали!...".

public class Rocket {

    public static void main(String[] args) {

        int countDown = 10;
        int count = 0;
        System.out.println("We have " + countDown + " sec before start. ");

        while (countDown > 0){
            countDown--; // уменьшает значение на 1
            System.out.println("We have " + countDown + " till start. ");
        }

        System.out.println("Here we go!");
    }
}
