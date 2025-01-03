package classwork_27.ait.employee.test;

import classwork_27.ait.employee.dao.Company;
import classwork_27.ait.employee.dao.CompanyImpl;
import classwork_27.ait.employee.model.Employee;
import classwork_27.ait.employee.model.Manager;
import classwork_27.ait.employee.model.SalesManager;
import classwork_27.ait.employee.model.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {

    Company company;
    Employee[] emp;

    @BeforeEach
    void setUp() {

        company = new CompanyImpl(5);
        emp = new Employee[4];
        emp[0] = new Manager(1, "N1", "L1", 160, 5000, 25);
        emp[1] = new SalesManager(2, "N2", "L2", 160, 50000, 0.1);
        emp[2] = new SalesManager(3, "N3", "L3", 160, 80000, 0.15);
        emp[3] = new Worker(4, "N4", "L4", 160, 20);

    }

    @Test
    void addEmployeeTest() {
        // check size
        assertEquals(4, company.quantity());

        //can't add null
        assertFalse(company.addEmployee(null));

        //can't add duplicate
        assertFalse(company.addEmployee(emp[1]));

        //can add new one employee
        Employee newEmp = new Worker(5, "N5", "L5", 150, 20);
        assertTrue(company.addEmployee(newEmp));

        //check size
        assertEquals(5,company.quantity());

        //can't add one more employee
        Employee oneMoreEmp = new Worker(6, "N6", "L6", 150, 20);
        assertFalse(company.addEmployee(oneMoreEmp));

    }

    @Test
    void removeEmployeeTest() {


    }

    @Test
    void findEmployeeTest() {
        // find existed
        assertEquals( emp[2], company.findEmployee(3));
        // find absent
        assertNull(company.findEmployee(7));
    }

    @Test
    void updateEmployeeTest() {

    }

    @Test
    void quantityTest() {
        assertEquals(4, company.quantity());
    }

    @Test
    void printEmployeeTest() {
        company.printEmployee();
        // методы типа void не проверяются с помощью assert...
    }

    @Test
    void totalSalaryTest() {
        double totalSalary = 29200;
       // assertEquals(totalSalary, company.totalSalary());


    }

    @Test
    void totalSalesTest() {
       // assertEquals(130000, company.totalSales());
    }

    @Test
    void findEmployeeHoursGreaterThanTest() {

    }

    @Test
    void findEmployeeSalaryRangeTest() {

    }
}
