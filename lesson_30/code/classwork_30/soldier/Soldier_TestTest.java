package classwork_30.soldier;

//- John, 182, 82.3, 91
//- Peter, 175, 77.1, 75
//- Robin, 162, 55.1, 91
//- Mary, 159, 55.1, 91
//- Ann, 162, 55, 88

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Soldier_TestTest {

    Soldier[] soldier;

    @BeforeEach
    void setUp() {

        soldier = new Soldier[] {

                new Soldier("John", 182, 82.3, 91),
                new Soldier("Peter", 175, 77.1, 75),
                new Soldier("Robin", 162, 55.1, 91),
                new Soldier("Mary", 159, 55.1, 91),
                new Soldier("Ann", 162, 55, 88)

        };
    }

    @Test
    void testNativeSorting(){
        System.out.println("-----------Print as is-----------");
        printArray(soldier);
        Arrays.sort(soldier);
        System.out.println("-----------Print as is-----------");
        printArray(soldier);
    }

    public void printArray(Object[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}