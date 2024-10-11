package aaray_tdd;

import java.util.Arrays;
import java.util.Objects;

public class ArrayTdd {

    private int[] arrayTdd;

    public ArrayTdd(int[] arrayTdd) {
        this.arrayTdd = arrayTdd;
    }

    public int[] getArrayTdd() {
        return arrayTdd;
    }

    public void setArrayTdd(int[] arrayTdd) {
        this.arrayTdd = arrayTdd;
    }

    @Override
    public String toString() {
        return "ArrayTdd{" +
                "arrayTdd=" + Arrays.toString(arrayTdd) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArrayTdd arrayTdd1)) return false;
        return Objects.deepEquals(arrayTdd, arrayTdd1.arrayTdd);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arrayTdd);
    }

    //count positive numbers in array
    public int countPositive(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0){
                count++;
            }
        }
        return count;
    }
}
