package homework_13;

//Подбросьте монетку 100 раз и подсчитайте, сколько раз выпал орел и сколько решка.
// Запишите результаты в массив. Рассчитайте вероятность выпадения орла и решки.

import java.util.Random;

public class ArrayCoinMethod {
    public static boolean flipCoin (){
        Random random = new Random();
        return random.nextBoolean(); // true for orel and false for reshka
    }

}
