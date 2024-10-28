package classwork_33.month;

public class MonthAppl {

    public static void main(String[] args) {

        Month m = Month.AUG;
        System.out.println("Start month: " + m);

        int k = 7;

        m = m.plusMonth(m,k);
        System.out.println("After " + 6 + " months: " + m); //август плюс 6 месяцев = февраль


    }

}
