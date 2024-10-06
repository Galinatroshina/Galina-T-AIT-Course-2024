package homework_10;

// Заполнить массив четными числами от 0 до 50. 0, 2, 4, 8, ... , 42, 44, 48, 50
// Распечатать массив в порядке возрастания, затем в порядке убывания.

public class Numbers {

    public static void main(String[] args) {

        int [] numbers = new int[26];
        int indexNum  = 0;

        for (int i = 0; i <= 50; i+= 2) {
            numbers[indexNum] = i;
            indexNum++;
        }

        System.out.println("Even ascending numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        System.out.println("Even descending numbers: ");

        for (int i = numbers.length - 1; i>=0; i--) {
            System.out.print(numbers[i] + " ");
        }



    }

}
