package homework_28.ait.employee.dao;

import homework_28.ait.employee.model.Employee;
import homework_28.ait.employee.model.SalesManager;
import homework_28.ait.employee.model.Worker;

import java.util.function.Predicate;

public class CompanyImpl implements Company {

    private Employee[] employees;
    private int size;

    // capacity - возможное кол-во сотрудников
    public CompanyImpl(int capacity) {
        this.employees = new Employee[capacity];
        this.size = 0;
    }

    @Override
    public boolean addEmployee(Employee employee) {

        //bad case
        if(employee == null){
            return false;
        }

        //good case
        employees[size] = employee;
        size++;
        return true;

    }

    @Override
    public Employee removeEmployee(int id) {
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id){
                return employees[i];
            }

        }
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printEmployee() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    @Override
    public double totalSalary() {
        double totalSalary = 0;
        for (int i = 0; i < size; i++) {
            totalSalary += employees[i].calcSalary();
        }
        return totalSalary;
    }

    @Override
    public double totalSales() {
        double totalSales = 0;
        for (int i = 0; i < size; i++) {
            if(employees[i] instanceof SalesManager){ // проверка перед кастингом
                SalesManager sm = (SalesManager) employees[i];
                totalSales += sm.getSalesValue();
            }
        }
        return totalSales;
    }

    @Override
    public double averageSalary() {
        // Проверяем, что у нас есть хотя бы один сотрудник
        if (size == 0) {
            return 0;
        }
            double totalSalary = totalSalary();
            return totalSalary / size;

    }

    private Employee[] findEmployeeByPredicate (Predicate<Employee> predicate){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(predicate.test(employees[i])){
                count++;
            }
        }
        Employee[] res = new Employee[count];
        for (int i = 0; i < res.length; i++) {
            if(predicate.test(employees[i])){
                res[i++] = employees[i];
            }
        }
        return res;
    }

    @Override
    public Employee[] findEmployeeHoursGreaterThan(int hours) {
        return findEmployeeByPredicate(employee -> employee instanceof Worker && employee.getHours() > hours);
    }

    @Override
    public Employee[] findEmployeeSalaryRange(double min, double max) {
        return findEmployeeByPredicate(employee -> {
            double salary = employee.calcSalary();
            return salary >= min && salary <= max;
        });
    }
}
