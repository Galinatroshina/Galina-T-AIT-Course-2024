package homework_28.ait.employee.dao;
//- добавление сотрудника +
//- нахождение сотрудника по id +
//- обновление cотрудника +
//- удаление сотрудника +
//- печать списка сотрудников +
//- кол-во сотрудников +
//- объем ФОТ
//- объем продаж

import homework_28.ait.employee.model.Employee;

public interface Company {

    boolean addEmployee(Employee employee);

    Employee removeEmployee(int id);

    Employee findEmployee(int id);

    Employee updateEmployee(Employee employee);

    int quantity();

    void printEmployee();

    double totalSalary();

    double totalSales();

    double averageSalary();

    Employee[] findEmployeeHoursGreaterThan(int hours); //массив сотрудников добавили, чьобы всех захватить

    Employee[] findEmployeeSalaryRange(double min, double max);



}