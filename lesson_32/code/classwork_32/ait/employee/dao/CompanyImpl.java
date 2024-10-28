package classwork_32.ait.employee.dao;

import classwork_32.ait.employee.model.Employee;
import classwork_32.ait.employee.model.SalesManager;

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
        // bad cases
        if(employee == null){
            return false;
        }
        if(size == employees.length){
            return false;
        }
        if(findEmployee(employee.getId()) != null) {
            return false;
        }
        // good case
        employees[size] = employee; // put in array
        size++;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if(employees[i].getId() == id){
                Employee victim = employees[i];
                System.arraycopy(employees, i + 1, employees, i , size - i - 1 );
                employees[--size] = null;
                return victim;
            }
        }
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
        //отыскать нужного в массиве и обновить ему поля, забирая их из employee
        for (int i = 0; i < size; i++) {
            if(employees[i].getId() == employee.getId()){
                //employees[i].setSecondName(employee.getSecondName());
                //employees[i].getHours(employee.getHours());
                employees[i] = employee;
                return employees[i];
            }
        }
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
        return findEmployeeByPredicate(employee -> employee.getHours() > hours);
    }

    @Override
    public Employee[] findEmployeeSalaryRange(double min, double max) {
        return findEmployeeByPredicate(employee -> {
            double salary = employee.calcSalary();
            return salary >= min && salary <= max;
        });
    }


}
