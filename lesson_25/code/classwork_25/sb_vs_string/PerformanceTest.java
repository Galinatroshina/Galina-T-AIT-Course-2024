package classwork_25.sb_vs_string;
// Выясняем что быстрее работает: просто строка стринг или стрингбилдер
// 100 000 сказать "Meow"
// string vs StringBuilder

public class PerformanceTest {

    // константные иттерации
    private static final int N_ITERATION = 100_000;
    private static final String WORD = "Meow";

    public static void main(String[] args) {

        //String
        long t1 = System.currentTimeMillis(); //счетчик начало
        String str = "";
        for (int i = 0; i < N_ITERATION; i++) { //цикл для 100 000 раз
            str = str + WORD; //мтрока добавляет 100 000 раз
        }
        long t2 = System.currentTimeMillis(); // стоп счетчик
        System.out.println("Time String = " + (t2-t1)); //печатем результат по времени

        //StringBuilder
        t1 = System.currentTimeMillis(); //не пишем long потому что он уже анонсирован наверху
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < N_ITERATION; i++) {
            sb = sb.append(WORD);
        }
        t2 = System.currentTimeMillis(); // стоп счетчик
        System.out.println("Time StringBuilder = " + (t2-t1)); //печатем результат по времени


    }
}
