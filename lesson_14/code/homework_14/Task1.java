package homework_14;

//Задача 1. Часть1. Заполните массив целыми числами от 1 до 100. Создайте второй массив с размером на 1 больше,
// чем имеющийся. Скопируйте первый массив в новый массив.
//
//Часть 2. Добавьте случайное целое число в интервале от 1 до 100 на случайное место в исходный массив.
//
//Часть 3. В полученном массиве найдите наиболее коротким способом, какое число было добавлено в массив.


public class Task1 {

    public static void main(String[] args) {

        // Part 1
        int [] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) { // заполняем массив
            numbers[i] = i + 1;
        }
        int[] newArray = new int[numbers.length +1]; // создаем второй массив с размером на 1 больше
        for (int i = 0; i < numbers.length; i++) { // копируем первый массив во второй
            newArray[i] = numbers[i];
            //ArrayMethods.printArray(newArray);
        }
        System.out.println("=========================================");

        //part 2
        int[] randomNumbers = ArrayMethods.fillArray(1,100,6); //создаем массив из рандомных чисел
        for (int i = 0; i < randomNumbers.length; i++) { //добавляем случайное число в диапазоне 1 до 100 в массив
            randomNumbers[i] = i + 1; //случайное число плюс 1
            ArrayMethods.printArray(randomNumbers); // print
        }


        //part 3
        //найти это случайное добавленное число




    }

}
