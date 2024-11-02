package homework_37;
//На основе класса Computer:
//
//создать собственный ArrayList;
//добавить в него не менее 6 элементов;
//отсортировать список по бренду;
//отсортировать список по размеру RAM, затем размеру SSD при равенстве RAM;
//подсчитать общий суммарный объем и среднее значение SSD.

import java.util.*;

public class ComputerShopAppl {

    public static void main(String[] args) {

        List<Computer> computerShopList  = new ArrayList<>();
        computerShopList.add(new Computer("Apple", 16, 522));
        computerShopList.add(new Computer("HP", 8, 256));
        computerShopList.add(new Computer("Dell", 16, 1024));
        computerShopList.add(new Computer("Lenovo", 8, 128));
        computerShopList.add(new Computer("Asus", 32, 512));
        computerShopList.add(new Computer("Acer", 16, 256));

        //print
        for (Computer computer : computerShopList){
            System.out.println(computer);
        }

        System.out.println("-------------------------------------");
        computerShopList.sort(Computer ::compareTo);
        for (Computer computer : computerShopList){
            System.out.println(computer);
        }

        System.out.println("----------------Hash Set / Sort by Brand---------------");
        Set<Computer> computerShopSet = new HashSet<>();
        computerShopSet.add(new Computer("Apple", 16, 522));
        computerShopSet.add(new Computer("HP", 8, 256));
        computerShopSet.add(new Computer("Dell", 16, 1024));
        computerShopSet.add(new Computer("Lenovo", 8, 128));
        computerShopSet.add(new Computer("Asus", 32, 512));
        computerShopSet.add(new Computer("Acer", 16, 256));

        for (Computer computer : computerShopSet){
            System.out.println(computer);
        }

        System.out.println("----------------Sort by Ram and SSD---------------");
        computerShopList.sort(Comparator.comparingInt(Computer::getRam).thenComparingInt(Computer::getSsd));

        for (Computer computer : computerShopList) {
            System.out.println(computer);
        }

        System.out.println("----------------Sum by SSD---------------");
        int totalSsd = 0;
        for (Computer computer : computerShopList) {
            totalSsd += computer.getSsd();
        }
        System.out.println("Total SSD: " + totalSsd);

        System.out.println("----------------Average by SSD---------------");
        double averageSsd = (double) totalSsd / computerShopList.size();
        System.out.println("Average SSD: " + averageSsd);








    }

}
