package classwork_19.compare_computers;

//сравнение двух Computers

import java.util.Scanner;

public class ComparComputers {
    public static void main(String[] args) {

        Computer c1 = new Computer("i7", 32, 1024, "HP", 1500);
        System.out.println(c1);

/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Input CPU: ");
        String cpu = scanner.nextLine();
        System.out.println("Input RAM: ");
        int ram = scanner.nextInt();
        System.out.println("Input SSD: ");
        int ssd = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Input Brand: ");
        String brand = scanner.nextLine();
        System.out.println("Input Price: ");
        double price = scanner.nextDouble();*/

        //scanner.nextLine();

        Computer c2 = new Computer("i7", 32, 1024, "HP", 1500);
        System.out.println(c2);

        boolean checker = (c1==c2);
        System.out.println(checker); //false because links not equal

        System.out.println("----------------");
        checker = c1.equals(c2);
        System.out.println(checker); //
    }

}
