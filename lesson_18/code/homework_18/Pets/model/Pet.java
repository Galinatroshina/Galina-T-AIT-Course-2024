package homework_18.Pets.model;

public class Pet {

    private int id;
    private String animal;
    private int age;
    private String name;

    public Pet(int id, String animal, int age, String name) {
        this.id = id;
        this.animal = animal;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", animal='" + animal + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}
