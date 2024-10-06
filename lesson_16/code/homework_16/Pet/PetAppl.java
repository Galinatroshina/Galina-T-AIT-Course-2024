package homework_16.Pet;
// В классе PetAppl создать несколько экземпляров домашних животных. Отобразить прожитый день.

import homework_16.Pet.model.Pet;

public class PetAppl {

    public static void main(String[] args) {

        Pet catRB = new Pet(1, "Russian Blue", 1, "Chester" );
        Pet dog = new Pet(2, "Golden Retriever", 3, "Buddy" );
        Pet koala = new Pet(3, "Phascolarctos cinereus", 2, "Koko" );
        Pet chicken = new Pet(4, "Leghorn", 1, "Clucky" );
        Pet snake = new Pet(5, "Ball Python", 5, "Slinky" );

        catRB.toString();
        System.out.println(catRB);
        catRB.sleep();
        catRB.doing();
        catRB.eating();
        catRB.walk();
        catRB.sleep();
        catRB.sleep();
        catRB.sleep();
        catRB.sleep();

        dog.toString();
        System.out.println(dog);
        dog.sleep();
        dog.eating();
        dog.play();
        dog.eating();
        dog.sound();
        dog.walk();
        dog.eating();
        dog.sleep();
        dog.play();
        dog.doing();
        dog.sleep();

        koala.toString();
        System.out.println(koala);

        koala.eating();
        koala.eating();
        koala.eating();
        koala.sleep();
        koala.sleep();
        koala.sleep();
        koala.eating();
        koala.sleep();

        chicken.toString();
        System.out.println(chicken);

        chicken.walk();
        chicken.sound();
        chicken.sound();
        chicken.sound();
        chicken.sound();
        chicken.sound();
        chicken.eating();
        chicken.sleep();

        snake.toString();
        System.out.println(snake);

        snake.sleep();
        snake.eating();
        snake.sleep();

    }
}
