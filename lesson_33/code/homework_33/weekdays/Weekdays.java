package homework_33.weekdays;
//Задать ENUM weekDay - дни недели. Опробовать на нем методы: .values() .toString .ordinal() .valueOf()
//
//Реализуйте метод, позволяющий прибавлять дни к выбранному дню недели, получая правильный день недели. Пример: Monday + 10 days = Thursday (понедельник + 10 дней = четверг) Проверьте работу метода с помощью теста.

public enum Weekdays {
    MON("Monday", 1), TUE("Tuesday", 2), WED("Wednesday", 3), THU("Thursday", 4), FRI("Friday", 5), SAT("Saturday", 6), SUN("Sunday", 7);

    //fields
    private String name;
    private int dayNumber;

    Weekdays(String name, int dayNumber) {
        this.name = name;
        this.dayNumber = dayNumber;
    }

    public String getName() {
        return name;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Weekdays{");
        sb.append("name='").append(name).append('\'');
        sb.append(", dayNumber=").append(dayNumber);
        sb.append('}');
        return sb.toString();
    }

    public Weekdays plusDay (Weekdays weekdays, int quantity){
        int n = weekdays.ordinal();
        int index = n + quantity;
        Weekdays[] days = weekdays.values();
        int res = index % days.length;

        return days[res];
    }
}
