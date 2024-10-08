package homework_19.Products;

import homework_19.Products.model.Food;
import homework_19.Products.model.MeatFood;
import homework_19.Products.model.MilkFood;
import homework_19.Products.model.Product;

public class MarketAppl {

    public static void main(String[] args) {

        //создаем массив по продуктам
        Food [] foods = new Food[3];
        foods [0] = new MeatFood(10, "Chicken", 465674, "14.11.24", "Wings");
        foods [1] = new MilkFood(3.5, "Milk1", 34564345, "21.10.24", "Fresh", 3.5);
        foods [2] = new Food(1.99, "Butter", 4636, "20.20.24");

        //выводим на печать информацию по всем продуктам из массива
        for (int i = 0; i < foods.length; i++) {
            System.out.println("All of products: " + foods[i]);
        }

        System.out.println("===========================");

        //возвращаем сумму цен на все продукты
        double totalPrice = 0;
        for (int i = 0; i < foods.length; i++) {
            totalPrice += foods[i].getPrice();
        }
        System.out.println("Total price: " + totalPrice);

        //возвращаем баркод
        boolean checker = foods[0].equals(foods[1]);
        System.out.println(checker);


    }

}
