package homework_33.weekdays;

//Задать ENUM weekDay - дни недели. Опробовать на нем методы: .values() .toString .ordinal() .valueOf()
//
//Реализуйте метод, позволяющий прибавлять дни к выбранному дню недели, получая правильный день недели. Пример: Monday + 10 days = Thursday (понедельник + 10 дней = четверг) Проверьте работу метода с помощью теста.

public class WeekdaysAppl {

    public static void main(String[] args) {

        System.out.println("======== Task 1 =======");

        Weekdays w = Weekdays.MON;
        System.out.println("Start day: " + w);

        int k = 10;

        w = w.plusDay(w,k);
        System.out.println("After " + 10 + " days: " + w);


        System.out.println("======== Task 2 =======");

        Weekdays[] weekdays = Weekdays.values();
        System.out.println("----------- values of Enum ----------");
        for (int i = 0; i < weekdays.length; i++) {
            System.out.println(weekdays[i]);
            System.out.println(weekdays[i].getDayNumber() + " : " + weekdays[i].getName());
        }

        System.out.println("----------- toString ----------");
        String str = Weekdays.WED.toString();
        System.out.println(str);

        System.out.println("----------- ordinal ----------");
        int num = Weekdays.WED.ordinal();
        System.out.println(num);
        num = Weekdays.THU.ordinal();
        System.out.println(num);

        System.out.println("----------- valueOf ----------");
        Weekdays w1 = Weekdays.valueOf("SUN");
        System.out.println(w1);

        }

    }

