package classwork_08;

public class Postfix {
    // разница префиксных и постфиксных операций:

  //  int i =5
// (i++)*10 - сначала берется и запоминается для дальнейшего использования текущее значение I и именно оно умножается на 10 (то есть 5*10) а потом значение самого i увеличивается на 1

  //  int i =5
// (++i)*10 - сначала увеличивается значение самого i на 1 а потом уже с этим значением производятся все дальнейшие операции (то есть i = 6, 6*10)


    public class CW9 {
        public static void main(String[] args) {
            int i = 5;
            System.out.print("(i++)*10)  = ");
            System.out.print((i++)*10);
            System.out.print(" ,  i  =  ");
            System.out.println(i);

            System.out.println("======================");

            i = 5;
            System.out.print("(++i)*10)  = ");
            System.out.print((++i)*10);
            System.out.print(" ,  i  =  ");
            System.out.println(i);

        }
    }

    // результат будет:

            // (i++)*10)  = 50 ,  i  =  6
            // ======================
            // (++i)*10)  = 60 ,  i  =  6

}
