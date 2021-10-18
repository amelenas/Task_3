package test.stepanovichalena.task_03.task0301.collections;

import by.stepanovichalena.task_03.task0301.collections.ArrayInteger;
import by.stepanovichalena.task_03.exception.Task03Exception;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;


public class ArrayIntegerTest {
    int[] values = {1, 3, 6, 45, 654, 54, 654, 65, 465, 465, 46, 54, 564, 87, 9, 8, 78, 54, 21, 32, 5, 4};


    @Test
    public void getArray() throws Task03Exception {
        ArrayInteger arrayInteger = new ArrayInteger(values);
        String expected = Arrays.toString(arrayInteger.getArray());
        String actual = Arrays.toString(values);
        assertEquals(expected, actual);
    }


    @Test
    public void containsTrue() throws Task03Exception {
        ArrayInteger arrayInteger = new ArrayInteger(values);

        boolean expected = true;
        boolean actual = arrayInteger.contains(564);
        assertEquals(expected, actual);
    }

    @Test
    public void containsFalse() throws Task03Exception {
        ArrayInteger arrayInteger = new ArrayInteger(values);

        boolean expected = false;
        boolean actual = arrayInteger.contains(22);
        assertEquals(expected, actual);
    }

    @Test
    public void add() throws Task03Exception {
        ArrayInteger arrayInteger = new ArrayInteger(values);
        assertTrue(arrayInteger.add(123));
    }

    @Test
    public void removeTrue() throws Task03Exception {
        ArrayInteger arrayInteger = new ArrayInteger(values);
        assertTrue(arrayInteger.remove(3));
    }
    @Test
    public void removeFalse() throws Task03Exception {
        ArrayInteger arrayInteger = new ArrayInteger(values);
        assertFalse(arrayInteger.remove(5465));
    }


    @Test
    public void clear() throws Task03Exception {
        ArrayInteger arrayInteger = new ArrayInteger(values);
        arrayInteger.clear();
        assertEquals(0, arrayInteger.size());
    }

    @Test
    public void size() throws Task03Exception {
        ArrayInteger arrayInteger = new ArrayInteger(values);
        int expected = 22;
        int actual = arrayInteger.size();
        assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTrue() throws Task03Exception {
        ArrayInteger arrayInteger = new ArrayInteger(values);
        arrayInteger.clear();
        assertTrue(arrayInteger.isEmpty());

    }

    @Test
    public void isEmptyFalse() throws Task03Exception {
        ArrayInteger arrayInteger = new ArrayInteger(values);
        assertFalse(arrayInteger.isEmpty());
    }


    @Test
    public void getIntArray() throws Task03Exception {
        ArrayInteger arrayInteger = new ArrayInteger(values);
        int [] array = arrayInteger.getIntArray();
        assertArrayEquals(array, values);
    }
}