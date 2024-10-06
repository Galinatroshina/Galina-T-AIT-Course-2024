package classwork;

// Имеются оценки абитуриента из его аттестата, всего 10 оценок.
//Найдите средний балл абитуриента.

public class StudentMarks {

    public static void main(String[] args) {

        int [] marks = {1, 6, 2, 4, 3, 1, 2, 3, 5, 2, 5}; //объявление массива в явном виде

        int sum = 0;

        for (int i = 0; i < marks.length; i++){
            sum = sum + marks[i];
        }

        System.out.println("Sum = " + sum);

        double averageMark = (double) sum / marks.length; //castng
        System.out.println("Average mark = " + averageMark);


    }
}
