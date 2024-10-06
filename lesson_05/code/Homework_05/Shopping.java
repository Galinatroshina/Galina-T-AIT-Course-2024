package Homework_05;

// Сделайте расчет покупки товаров со скидками.
// Товар А стоит X евро и на него скидка D%, а товар B стоит Y евро и на него скидка С%.
// Клиент взял N товаров A и M товаров B. Если сумма покупки превысила 100 евро,
// то полагается дополнительная скидка 5%. Вычислите итоговую стоимость покупки и величину полученной скидки.

public class Shopping {

    public static void main(String[] args) {

        int artA = 100;
        int discountA = 10;
        int quantityA = 1;

        int withDiscountA = artA * (1 - discountA / 100);
        int costA = withDiscountA * quantityA;

        int artB = 30;
        int discountB = 5;
        int quantityB = 2;

        int priceNoDiscount = artA + artB;

        int withDiscountB = artB * (1 - discountB / 100);
        int costB = withDiscountB * quantityB;

        int totalCost = costA + costB;

        int totalDiscount = totalCost - priceNoDiscount;

        System.out.println("Total discount " + totalDiscount + " %");
        

        if(totalCost > 100){
           totalCost *= 0.95;
            System.out.println("End price " + totalCost + " Euro");

        }

    }
}
