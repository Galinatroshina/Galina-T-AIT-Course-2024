package employee;

import employee.model.Employee;

public class FirmaApp {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "N1", "LN1", 3000, true);
        Employee e2 = new Employee(2, "N2", "LN2", 4000, true);
        Employee e3 = new Employee(3, "N3", "LN3", 5000, false);
        Employee e4 = new Employee(4, "N4", "LN4", 2300, false);
        Employee e5 = new Employee(5, "N5", "LN5", 1100, true);

        System.out.println(e1.displayEmployee());
        System.out.println(e2.displayEmployee());
        System.out.println(e3.displayEmployee());
        System.out.println(e4.displayEmployee());
        System.out.println(e5.displayEmployee());

        double totalSalary =  e1.getSalary() + e2.getSalary() + e3.getSalary() + e4.getSalary() + e5.getSalary();
        System.out.println("Total salary = " + totalSalary);

        //как с массивом сделать тоже самое
        Employee[] employees = new Employee[5];
        employees[0] = e1;
        employees[1] = e1;
        employees[2] = e1;
        employees[3] = e1;
        employees[4] = e1;

        totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            totalSalary += employees[i].getSalary();
        }
        System.out.println(totalSalary);

    }
}
