package classwork_25.string_builder;

public class StringBuilderAppl {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb);

        sb.append("_").append("21"); //append - добавить или присоеденить
        System.out.println(sb);

        sb.reverse(); //разворот
        System.out.println(sb);

        StringBuilder sbNew = new StringBuilder("Hello");
        sbNew.insert(5,"!");
        System.out.println(sbNew);
        sbNew.append(true);
        System.out.println(sbNew);

    }
}
