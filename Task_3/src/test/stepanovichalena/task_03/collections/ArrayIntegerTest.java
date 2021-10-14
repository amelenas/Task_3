package test.stepanovichalena.task_03.collections;

import by.stepanovichalena.task_03.task0301.collections.ArrayInteger;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;


public class ArrayIntegerTest {
    int[] values = {1, 3, 6, 45, 654, 54, 654, 65, 465, 465, 46, 54, 564, 87, 9, 8, 78, 54, 21, 32, 5, 4};


    @Test
    public void getArray(){
        ArrayInteger arrayInteger = new ArrayInteger(values);
        String expected = Arrays.toString(arrayInteger.getArray());
        String actual = Arrays.toString(values);
        assertEquals(expected, actual);
    }


    @Test
    public void containsTrue() {
        ArrayInteger arrayInteger = new ArrayInteger(values);

        boolean expected = true;
        boolean actual = arrayInteger.contains(564);
        assertEquals(expected, actual);
    }

    @Test
    public void containsFalse() {
        ArrayInteger arrayInteger = new ArrayInteger(values);

        boolean expected = false;
        boolean actual = arrayInteger.contains(22);
        assertEquals(expected, actual);
    }

    @Test
    public void add() {
        ArrayInteger arrayInteger = new ArrayInteger(values);
        assertTrue(arrayInteger.add(123));
    }

    @Test
    public void removeTrue() {
        ArrayInteger arrayInteger = new ArrayInteger(values);
        assertTrue(arrayInteger.remove(3));
    }
    @Test
    public void removeFalse() {
        ArrayInteger arrayInteger = new ArrayInteger(values);
        assertFalse(arrayInteger.remove(5465));
    }


    @Test
    public void clear() {
        ArrayInteger arrayInteger = new ArrayInteger(values);
        arrayInteger.clear();
        assertTrue(arrayInteger.size() == 0);
    }

    @Test
    public void size() {
        ArrayInteger arrayInteger = new ArrayInteger(values);
        int expected = 22;
        int actual = arrayInteger.size();
        assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTrue() {
        ArrayInteger arrayInteger = new ArrayInteger(values);
        arrayInteger.clear();
        assertTrue(arrayInteger.isEmpty());

    }

    @Test
    public void isEmptyFalse() {
        ArrayInteger arrayInteger = new ArrayInteger(values);
        assertFalse(arrayInteger.isEmpty());
    }


}