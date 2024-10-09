package homework_20.application;

// Напишите приложение, которое выводит минимальные/максимальные числовые значения примитивных типов: byte, short, char, int, long, float, double Типы как объекты String должны браться из аргументов основной функции main.
//
// Если в аргументах нет какого-либо типа (не указан тип), приложение должно вывести максимальное/минимальное значения 7 типов (byte, int, short, long, char, float, double). Если аргументы содержат неправильный тип, приложение должно вывести сообщение: Неверный тип.

public class NumbersAppl {

    public static void main(String[] args) {

        int a = 1234567890;
        Integer aInt = a;
        System.out.println("Max value of int: " + aInt.MAX_VALUE);
        System.out.println("Min value of int: " + aInt.MIN_VALUE);
        System.out.println("---------------------------");

        byte b = 123;
        Byte bByte = b;
        System.out.println("Max value of byte: " + bByte.MAX_VALUE);
        System.out.println("Min value of byte: " + bByte.MIN_VALUE);
        System.out.println("---------------------------");

        short s = 12345;
        Short sShort = s;
        System.out.println("Max value of short: " + sShort.MAX_VALUE);
        System.out.println("Min value of short: " + sShort.MIN_VALUE);
        System.out.println("---------------------------");

        char c = 12345;
        Character cChar = c;
        System.out.println("Max value of char: " + (int) cChar.MAX_VALUE);
        System.out.println("Min value of char: " + (int) cChar.MIN_VALUE);
        System.out.println("---------------------------");

        long l = 1234567890;
        Long lLong = l;
        System.out.println("Max value of long: " + lLong.MAX_VALUE);
        System.out.println("Min value of long: " + lLong.MIN_VALUE);
        System.out.println("---------------------------");

        float f = 1234567890;
        Float fFloat = f;
        System.out.println("Max value of float: " + fFloat.MAX_VALUE);
        System.out.println("Min value of float: " + fFloat.MIN_VALUE);
        System.out.println("---------------------------");

        double d = 0;
        Double dDouble = d;
        System.out.println("Max value of double: " + dDouble.MAX_VALUE);
        System.out.println("Min value of double: " + dDouble.MIN_VALUE);
        System.out.println("---------------------------");

        if (args.length == 0){
            System.out.println("Max value of int: " + aInt.MAX_VALUE);
            System.out.println("Min value of int: " + aInt.MIN_VALUE);
            System.out.println("Max value of byte: " + bByte.MAX_VALUE);
            System.out.println("Min value of byte: " + bByte.MIN_VALUE);
            System.out.println("Max value of short: " + sShort.MAX_VALUE);
            System.out.println("Min value of short: " + sShort.MIN_VALUE);
            System.out.println("Max value of char: " + (int) cChar.MAX_VALUE);
            System.out.println("Min value of char: " + (int) cChar.MIN_VALUE);
            System.out.println("Max value of long: " + lLong.MAX_VALUE);
            System.out.println("Min value of long: " + lLong.MIN_VALUE);
            System.out.println("Max value of float: " + fFloat.MAX_VALUE);
            System.out.println("Min value of float: " + fFloat.MIN_VALUE);
            System.out.println("Max value of double: " + dDouble.MAX_VALUE);
            System.out.println("Min value of double: " + dDouble.MIN_VALUE);
            return;
        }

        if (Double.isNaN(d) || Double.isInfinite(d)){
            System.out.println("Wrong.");
        } else System.out.println(d);
    }
}
