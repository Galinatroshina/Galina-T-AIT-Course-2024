package homework_29.car_garage.ait.cars.model;

import classwork_29.wine.Wine;

import java.util.Objects;

public class Car implements Comparable <Car> {

    private String regNumber;
    private String model;
    private String company;
    private double engine;
    private String color;
    private int age;



    public Car(String regNumber, String model, String company, double engine, String color, int age) {
        this.regNumber = regNumber;
        this.model = model;
        this.company = company;
        this.engine = engine;
        this.color = color;
        this.age = age;

    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getModel() {
        return model;
    }

    public String getCompany() {
        return company;
    }

    public double getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Double.compare(engine, car.engine) == 0 && age == car.age && Objects.equals(regNumber, car.regNumber) && Objects.equals(model, car.model) && Objects.equals(company, car.company) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber, model, company, engine, color, age);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("regNumber='").append(regNumber).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append(", engine=").append(engine);
        sb.append(", color='").append(color).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Car cars) {
        return Integer.compare(this.getAge(), cars.getAge());
    }

} // end of class
