package homework_28.ait.employee.test;

import homework_28.ait.employee.dao.Company;
import homework_28.ait.employee.dao.CompanyImpl;
import homework_28.ait.employee.model.Employee;
import homework_28.ait.employee.model.Manager;
import homework_28.ait.employee.model.SalesManager;
import homework_28.ait.employee.model.Worker;
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

        // TODO add employees to company
        for (int i = 0; i < 4; i++) {
            company.addEmployee(emp[i]);
        }
        assertEquals(4, company.quantity());
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
       assertEquals(totalSalary, company.totalSalary());


    }

    @Test
    void totalSalesTest() {
       assertEquals(130000, company.totalSales());
    }

    @Test
    void averageSalaryTest(){
        double expectedAverageSalary = company.totalSalary() / 4;
        assertEquals(expectedAverageSalary, company.averageSalary(), 0.001, "wrong");
    }


    @Test
    void findEmployeeHoursGreaterThanTest(){
        Employee[] res = company.findEmployeeHoursGreaterThan(100); // больше 100 часов
        assertEquals(1, res.length); //все 4 сотрудника
        res = company.findEmployeeHoursGreaterThan(160); //больше 160 часов
        assertEquals(0, res.length); //никто рне работает боль ше 160 ч, поэтому ожидаем 0
    }

    @Test
    void findEmployeeSalaryRangeTest(){
        Employee[] res = company.findEmployeeSalaryRange(5000, 10000);
        assertEquals(2, res.length);

        res = company.findEmployeeSalaryRange(0,5000);
        assertEquals(2, res.length);

    }
}
