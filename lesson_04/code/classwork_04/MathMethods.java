package classwork_04;


public class MathMethods {

    public static void main(String[] args) {

// перевод долларов в евро



// количество съеденных калорий

        double weight = 200; // gramms
        double calorage = 50; // calorie pro 100 gramm
        double energy = calculateCalories(weight, calorage);
        System.out.println("Energy = " + energy);

// расход топлива и стоимости на поездку

    } // end of main

    private static double calculateCalories(double weight, double calorage){
        return weight*calorage / 100;


    }

    private static double exchangeDollarsToEuro(double money){
        double rate = 0.9;
        return money*rate;

    }



} // end of class
