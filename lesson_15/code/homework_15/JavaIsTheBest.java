package homework_15;

// Задача 1. Дана строка "I'm proud to learn Java! Java is the most famous programming language!!!" Выполнить практикум с этой строкой:
//Распечатать последний символ строки.
//Найти позицию подстроки “Java” в строке.
//Проверить, содержит ли заданная строка подстроку “Java”.
//Заменить все символы “o” на “a”.
//Преобразуйте строку к верхнему регистру.
//Преобразуйте строку к нижнему регистру.
//Вырезать подстроку Java c помощью метода substring().
//Проверить, заканчивается ли строка подстрокой “!!!”.
//Проверить, начинается ли строка подстрокой “I'm proud”.

public class JavaIsTheBest {

    public static void main(String[] args) {

        String str1 = "I'm proud to learn Java! ";
        String str2 = "Java is the most famous programming language !!!";

        String str = str1 + str2;
        System.out.println(str);

        int l = str.length();
        System.out.println(l);

        System.out.println("==================");

        // последний символ строки
        char ch = str.charAt(0);
        ch = str.charAt(str.length() - 1);
        System.out.println("Last symbol: " + ch);

        System.out.println("==================");

        //Найти позицию подстроки “Java” в строке
        String java = "Java";
        int position = str1.indexOf(java);
        int position2 = str2.indexOf(java);
        System.out.println("Позиция подстроки Java в первой строке: " + position);
        System.out.println("Позиция подстроки Java во второй строке: " + position2);

        System.out.println("==================");

        // Проверить, содержит ли заданная строка подстроку “Java”.
        boolean checker = str1.contains(java);
        boolean checker2 = str2.contains(java);
        System.out.println("Первая строка содержит подстроку Java: " + checker);
        System.out.println("Вторая строка содержит подстроку Java: " + checker2);

        System.out.println("==================");

        //Заменить все символы “o” на “a”.
        System.out.println(str.replace("o","a"));

        System.out.println("------------------");

        //Преобразуйте строку к верхнему регистру.
        String upCase = str.toUpperCase();
        System.out.println("Верхний регистр: " + upCase);

        //Преобразуйте строку к нижнему регистру.
        String lowCase = str.toLowerCase();
        System.out.println("Нижний регистр: " + lowCase);


        //Вырезать подстроку Java c помощью метода substring()
        // 1 вариант
        int startIndexJava = str.indexOf("Java");
        int endIndexJava = startIndexJava + "Java".length();

        String cut = str.substring(startIndexJava, endIndexJava);
        System.out.println("Вырезанная подстрока: " + cut);

        //С вырезанной частью , !доделать вторую часть!
        String cutOff = str.substring(0, startIndexJava) + str.substring(endIndexJava);
        System.out.println("Вырезанная подстрока: " + cutOff.trim());

        System.out.println("------------------");


        //Проверить, заканчивается ли строка подстрокой “!!!”
        String searchSym = "!!!";
        if (str.endsWith(searchSym)){ //если подставить str1, где не содержится !!!, то выдает else, метод работает
            System.out.println("Строка заканчивается: " + searchSym);
        } else {
            System.out.println("Строка не заканчивается: " + searchSym);
        }

        //Проверить, начинается ли строка подстрокой “I'm proud”.
        String searchWords = "I'm proud";
        if (str.startsWith(searchWords)){
            System.out.println("Строка начинается с подстрокой: " + searchWords);
        } else {
            System.out.println("Строка НЕ заканчивается с подстрокой " + searchWords);
        }
    }
}
