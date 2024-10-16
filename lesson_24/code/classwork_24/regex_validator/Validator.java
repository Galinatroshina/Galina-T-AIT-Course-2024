package classwork_24.regex_validator;


import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Validator {

    // CreditCardNumber
    public static boolean checkCreditCardNumber(String str) {
        return str.matches("\\d{8,16}");
    }

    //DateFormatEU - dd-MM-yyyy(?)
    public static boolean checkDateFormatEU(String str) {
        // TODO Homework checkDateFormatEU
        return str.matches("^([0-2][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.(\\d{4})$");
        // ^ и $ — начало и конец строки
        // ([0-2][0-9]|3[01]) — день от 01 до 29 или 30-31
        // \. — точка как разделитель
        // (0[1-9]|1[0-2]) — месяц от 01 до 12
        // (\d{4}) — четырёхзначный год
    }

    // DateFormatUS - yyyy-MM-dd
    public static boolean checkDateFormatUS(String str) {
        // TODO Homework checkDateFormatUS
        return str.matches("^(\\d{4})-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$|" + //месяц с 31 днем
                "|^(\\d{4})-(0[469]|11)-(0[1-9]|[12][0-9]|30)$|" + //месяц с 30 днями
                "|^(\\d{4})-02-(0[1-9]|[12][0-9])$"); // февраль с 28 или 29 днем

    }

    // PhoneNumber
    public static boolean checkPhoneNumber(String str){
        // TODO Homework checkPhoneNumber
        return str.matches("^\\+\\d{2}\\(\\d{2}\\)\\d{4}-\\d{4}$");
        //^ — начало строки
        //\+ — знак плюс
        //\d{2} — две цифры для кода страны
        //\( и \) — открывающая и закрывающая скобки
        //\d{2} — две цифры для кода оператора
        //\d{4} — четыре цифры для первой части номера
        //- — дефис как разделитель
        //\d{4} — четыре цифры для второй части номера
        //$ — конец строки
    }

    // LessEquals255
    public static boolean checkLessEquals255(String str){
        // TODO Homework checkLessEquals255
        return str.matches("^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
    }

}
