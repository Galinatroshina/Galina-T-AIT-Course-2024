package classwork_20.wrapper_classes_examples;

import java.math.BigInteger;

public class WrapperClassAppl {

    public static void main(String[] args) {

        int k = 1234567890;
        System.out.println(k);
        System.out.println("---------------------------");

        Integer integer = Integer.parseInt("1234567890"); // создает объекты
        System.out.println(integer);
        integer = integer + 5; // переприсвоили значение и переписали
        System.out.println(integer); // распечатывается новый вариант

        //автоупаковка
        Integer x = 5; // не надо призывать констурктор и вызввать new
        System.out.println(x * 10);

        //автораспаковка
        integer = 7; //переприсвоили значение Integer
        int z = x + integer; //две переменных, у каждой из которых тип Integer
        System.out.println(z);

        System.out.println("---------------------------");
        BigInteger myBigInt = new BigInteger("12345678901234567890"); //только стринг
        System.out.println(myBigInt);

        //колличество цифр в числе, 2 версия решения
        int b = 1234567890;
        Integer bInt = b; // присвоили Integer b, упаковали в интежер
        // смена типа
        String str = bInt.toString(); //числу сменили тип на стирнг
        int l = str.length();

        System.out.println("Number: " + b + " contains " + l + " digits.");

        System.out.println("---------------------------");
        System.out.println("Max value of int: " + bInt.MAX_VALUE); // max константа, какое максимальное значение мог бы принять этот инт
        System.out.println("Min value of int: " + bInt.MIN_VALUE); // min константа

        Double d = 0.0;
        System.out.println("Max value of double: " + d.MAX_VALUE);
        System.out.println("Max value of double: " + d.MIN_VALUE);

        System.out.println("---------------------------");
        //математические вычисления
        int n = 20;
        Integer m = 10;

        m = m + n;
        System.out.println(m);
        n = n + m;
        System.out.println(n + 1);

        Double pi = 3.14;
        double circleLength = 2 * pi * 10;
        System.out.println(circleLength);

        System.out.printf("Length of circle: %.2f ", circleLength);
        System.out.println();

        System.out.println("---------------------------");

        //NaN и Infinite

        double p = 20 / 0.0;

        if (Double.isNaN(p) || Double.isInfinite(p)){ // p это типа NaN не сществует или Infinite бесконечно
            System.out.println("Wrong operation, division by zero.");
        } else System.out.println(p);

        System.out.println("---------------------------");

        // Перевод String в число
        String str1 = "0098765432100";
        long num = Long.parseLong(str1);
        System.out.println(num);


    }
}
