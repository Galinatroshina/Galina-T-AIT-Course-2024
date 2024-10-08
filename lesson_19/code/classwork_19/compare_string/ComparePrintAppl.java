package classwork_19.compare_string;

//равенство строк - как понять?

public class ComparePrintAppl {

    public static void main(String[] args) {

        int x = 5; //стек
        int y = 5; //стек

        boolean checker = (x==y);
        System.out.println(checker); // true

        String str1 = "Europe"; //str1 - stack =>(link) Europe - heap
        String str2 = "Europe"; //str2 - stack =>(link) Europe - heap

        System.out.println("--------------------");

        checker = (str1==str2); //true
        System.out.println(checker);

        System.out.println("--------------------");

        String str3 = new String("Europe");
        checker = (str1==str3);
        System.out.println(checker); //фальш, потому что не equals

        System.out.println("--------------------");
        checker = str3.equals(str3); //compare Strings with method equals
        System.out.println(checker);

    }
}
