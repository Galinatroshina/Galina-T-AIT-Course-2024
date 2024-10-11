package aaray_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTddTestTest {

    ArrayTdd arrayTdd;

    @BeforeEach
    void setUp() {
        int [] array = {10, -10, 20, -15, 45}; //3
        arrayTdd =  new ArrayTdd(array);
    }

    @Test
    void countPositive(){
        int [] array = {10, -10, 20, -15, 45};
        //expected
        int expected = 3;
        //actual
        int actual = arrayTdd.countPositive(array);

        assertEquals(expected, actual, "Ok");

    }
}