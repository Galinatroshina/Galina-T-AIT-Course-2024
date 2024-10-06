package homework_16.Pet.model;

// Создать класс Pet (Домашнее животное) с приватными полями:
//id
//вид
//возраст
//кличка
//Стандартные методы: конструктор на все поля; геттеры и сеттеры на все поля; метод toString.
//Дополнительные методы: спать, есть, делать, звук, играть, гулять
//В классе PetAppl создать несколько экземпляров домашних животных. Отобразить прожитый день.

public class Pet {

    //field
    private int id;
    private String type;
    private int age;
    private String name;

    //constructor
    public Pet(int id, String type, int age, String name) {
        this.id = id;
        this.type = type;
        this.age = age;
        this.name = name;
    }

    //setter and getter
    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //toString
    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    //инкапсуляция
    public void sleep(){
        System.out.println("Pet is sleeping...");
    }
    public void eating(){
        System.out.println("Pet is eating...");
    }
    public void doing(){
        System.out.println("Pet is doing smthng...");
    }
    public void sound(){
        System.out.println("Pet make a sound...");
    }
    public void play(){
        System.out.println("Pet is playing...");
    }
    public void walk(){
        System.out.println("Pet is walking...");
    }
}
