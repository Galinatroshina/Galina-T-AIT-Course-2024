package classwork_26.ait.employee.model;

import java.util.Objects;

public abstract class Employee {

    protected static double minWage = 12.48; //минимульная ставка оплаты труда
    protected final int id; //добавить в конструктор
    protected String name;
    protected String secondName;
    protected double hours;

    public static double getMinWage(){
        return minWage;
    }
    public static void setMinWage(double minWage){
        if(minWage > Employee.minWage){
            Employee.minWage = minWage;
        }
    }

    public Employee(int id, String name, String secondName, double hours) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.hours = hours;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", secondName='").append(secondName).append('\'');
        sb.append(", hours=").append(hours);
        sb.append('}');
        return sb.toString();
    } //end of StringBuilder

    //methods for salary
    public abstract double calcSalary();

    protected double ensureSalary(double salary){
        if(salary < hours * minWage){ //если зарплата меньше часов умноженое на минимум
            System.out.println("Set min salary");
            salary = hours * minWage; //то зарплата будет равно часам умноженым на минимум


        }
        return salary;
    }


} //end of class
