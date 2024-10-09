package homework_19.Products;

import homework_19.Products.model.Food;
import homework_19.Products.model.MeatFood;
import homework_19.Products.model.MilkFood;
import homework_19.Products.model.Product;

public class MarketAppl {

    public static void main(String[] args) {

        //создаем массив по продуктам
        Product[] products = new Product[4];
        products[0] = new MeatFood(10, "Chicken", 465674, "14.11.24", "Wings");
        products[1] = new MilkFood(3.5, "Milk1", 34564345, "21.10.24", "Fresh", 3.5);
        products[2] = new Food(1.99, "Butter", 4636, "20.20.24");
        products[3] = new Product(2.5, "Persil", 123456789000L);

        //выводим на печать информацию по всем продуктам из массива
        for (int i = 0; i < products.length; i++) {
            System.out.println("All of products: " + products[i]);
        }

        System.out.println("===========================");

        //возвращаем сумму цен на все продукты
        double totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            totalPrice += products[i].getPrice();
        }
        System.out.println("Total price: " + totalPrice);

    }

    public static Product findProductByBarcode(Product[] products, long barCode) {
        for (Product product : products) {
            if (product.getBarCode() == barCode) {
                return product;
            }
        }
        return null;
    }

    //метод печатающий в консоль все не пищевые продукты
    public static void printProducts(Product[] products, boolean printOnlyNonFood) {
        for (Product product : products) {
            if (printOnlyNonFood) if (!(product instanceof Food)) {
                System.out.println(product);
            }
        }
    }
}