package classwork_15;

//Задание 2. Напишите программу, которая запрашивает строку от пользователя и затем:
//сообщает сколько слов в строке
//сообщает сколько букв (символов) в строке
//печатает строку задом наперед, начиная с последнего слова.

import java.util.Scanner;

public class UserCase {

    public static void main(String[] args) {

        // запрос строки у юзера
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something... ");
        String input = scanner.nextLine();

        //подсчет количества слов в строке
        String[] wordsQuantity = input.split(" ");
        int w = wordsQuantity.length;
        System.out.println("Numbers of words in sentence " + w);

        //подсчет количества символов в строке
        int charQuantity = input.length();
        System.out.println(charQuantity);

        //печатаем строку задом наперед
        StringBuilder reverse = new StringBuilder(); //для построения наоборот
        for (int i = w - 1; i >= 0; i--) {
            reverse.append(wordsQuantity[i]);
            if (i > 0) {
                reverse.append(" "); // пробелы
            }
        }
        System.out.println(reverse);
    }
}
