package classwork_34.time_api_exercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class TimeAppl {

    public static void main(String[] args) {

        //How much time?
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        System.out.println("------------------------------------");

        LocalDate gagarin = LocalDate.of(1961, 04, 12);
        System.out.println(gagarin); //ISO
        // Какой это был день недели и год?
        System.out.println(gagarin.getDayOfWeek());
        System.out.println(gagarin.getDayOfYear());

        System.out.println("--------------------- Is leap year? --------------------");
        int year = 2024;
        System.out.println("Is year " + year + " leap: " + Year.isLeap(year));
        System.out.println("--------------------------------");
        System.out.println(gagarin.isBefore(ld)); //true
        System.out.println(gagarin.isAfter(ld)); //false
        System.out.println("--------------------------------");
        long period = ChronoUnit.YEARS.between(gagarin, ld);
        System.out.println(period);

        System.out.println("--------------------------------");
        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE;
        String date = gagarin.format(df); //LocalDate to String
        System.out.println(date);

        //выбираем лругой формат
        df = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        date = gagarin.format(df);
        System.out.println(date);

        //задаем другой, собственный формат строки с датой
        System.out.println("--------------------------------");
        df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        date = gagarin.format(df);
        System.out.println(date);

        System.out.println("--------------------------------");
        df = DateTimeFormatter.ofPattern("dd/MMMM/YYYY");
        date = gagarin.format(df);
        System.out.println(date);

        //задаем locale
        df = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN);
        date = gagarin.format(df);
        System.out.println(date);







    }
}
