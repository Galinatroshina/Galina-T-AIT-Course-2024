package classwork_07_cycles;

// Возведите 3 в степень 10, выведите на печать все промежуточные результаты.

public class Power {

    public static void main(String[] args) {

        int pow = (int) Math.pow(3, 10); // здесь исправили double на int по предлагаемому касту

        int count = 0; // парметр цикла
        int res = 1;

        while (count < 10){
            res = res * 3; // возведение 3 в степень
            count++; // изменение параметра цикла
            System.out.println(res + " = 3 in power " + count);
        }




    }
}
