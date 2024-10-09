package homework_20.application;

//Разработайте приложение, которое принимает от пользователя строку (некое предложение, например: "Мама мыла раму.") и выводит:
//
//количество символов в строке;
//количество символов в верхнем регистре;
//количество цифр в строке;
//количество пробелов в строке;
//в зависимости от последнего символа в строке сообщает, какое это предложение:
//повествовательное;
//вопросительное;
//восклицательное. Используйте методы класса Character.

import java.util.Scanner;

public class UserCaseAppl {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // создаем поле ввода для юзера
        System.out.println("Input any message."); // создаем запрлс для юзера

        String str  = scanner.nextLine(); // читаем строку

        int countOfcharacters = str.length(); // считаем символы в строке с пробелами
        System.out.println("Count of characters is: " + countOfcharacters);

        System.out.println("-------------------------");

        int countOfUpperCase = 0;
        int countOfDigits = 0;
        int countOfSpaces = 0;
        for (char a : str.toCharArray()){
            if (Character.isUpperCase(a)){ //проверяем есть ли символы в верхнем регистре и считаем
                countOfUpperCase++;
            }
            if (Character.isDigit(a)){ //проверяем содержит ли строка цифры и считаем
                countOfDigits++;
            }
            if (Character.isWhitespace(a)){ //считаем пробелы
                countOfSpaces++;
            }
        }
        String typeOfSentence;
        char lastChar = str.charAt(str.length()-1); //чекаем тип предложеняи по последнему символу

        if (lastChar == '.') {
            typeOfSentence = "повествовательное";
        } else if (lastChar == '?'){
            typeOfSentence = "вопросительное";
        } else if (lastChar == '!'){
            typeOfSentence = "восклицательное";
        } else {
            typeOfSentence = "unknow";
        }

        System.out.println("Count of characters in upper case: " + countOfUpperCase);
        System.out.println("-------------------------");
        System.out.println("Count of digits: " + countOfDigits);
        System.out.println("-------------------------");
        System.out.println("Count of spaces: " + countOfSpaces);
        System.out.println("-------------------------");
        System.out.println("Type of sentence: " + typeOfSentence);
    }
}
