package homework_18.Pets;

import homework_18.Pets.model.Cat;
import homework_18.Pets.model.Dog;
import homework_18.Pets.model.Pet;


public class HouseAppl {
    public static void main(String[] args) {
        Cat cat = new Cat(1, "Cat", 1, "Whiskers", "Siamese", 20, 4);
        Dog dog = new Dog(1, "Dog", 2, "Charlie", "Labrador", 55, 30);

        Pet[] pets = new Pet[5];
        pets[0] = new Cat(1, "Cat", 1, "Whiskers", "Siamese", 20, 4);
        pets[1] = new Cat(2, "Cat", 2, "Milo", "Maine Coon", 25, 6);
        pets[2] = new Cat(3, "Cat", 4, "Bella", "Bengal", 22, 5);
        pets[3] = new Dog(1, "Dog", 2, "Charlie", "Labrador", 55, 30);
        pets[4] = new Dog(5, "Dog", 1, "Max", "German Shepherd", 60, 35);

        pets[0].toString();
        System.out.println(pets[0]);
        pets[0].sleep();
        pets[0].doing();
        pets[0].eating();
        pets[0].walk();
        pets[0].sleep();
        System.out.println(cat.voice);

        System.out.println("----------------");

        pets[1].toString();
        System.out.println(pets[1]);
        pets[1].sleep();
        pets[1].doing();
        pets[1].eating();
        pets[1].walk();
        pets[1].sleep();
        System.out.println(cat.voice);

        System.out.println("----------------");

        pets[2].toString();
        System.out.println(pets[2]);
        pets[2].sleep();
        pets[2].doing();
        pets[2].eating();
        pets[2].walk();
        pets[2].sleep();
        System.out.println(cat.voice);

        System.out.println("----------------");

        pets[3].toString();
        System.out.println(pets[3]);
        dog.sleep();
        dog.eating();
        dog.play();
        dog.eating();
        System.out.println(dog.voice);
        dog.walk();
        dog.eating();
        dog.sleep();
        dog.play();
        dog.doing();
        dog.sleep();
        System.out.println(dog.voice);

        System.out.println("----------------");

        pets[4].toString();
        System.out.println(pets[4]);
        dog.sleep();
        dog.eating();
        dog.play();
        dog.eating();
        System.out.println(dog.voice);
        dog.walk();
        dog.eating();
        dog.sleep();
        dog.play();
        dog.doing();
        dog.sleep();
        System.out.println(dog.voice);

    }
}
