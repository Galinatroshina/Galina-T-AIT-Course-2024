package string_numbers_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringWithNumbersTest {

    StringWithNumbers stringWithNumbers; // объект который будем тестить

    @BeforeEach
    void setUp() {
        stringWithNumbers = new StringWithNumbers("123 321 10"); //summa must be 454

    }
    @Test
    void sumOfNumbersInStringTest(){
        String str = "1 2 1";
        int expected = 4;
        int actual =  stringWithNumbers.sumOfNumbersInStringTest(str);
        assertEquals(expected, actual); // метод который сравнивает ожидаемое с актуальным
    }

}