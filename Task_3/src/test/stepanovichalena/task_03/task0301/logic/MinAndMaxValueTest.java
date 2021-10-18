package test.stepanovichalena.task_03.task0301.logic;

import by.stepanovichalena.task_03.exception.Task03Exception;
import by.stepanovichalena.task_03.task0301.logic.MinAndMaxValue;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinAndMaxValueTest {
    MinAndMaxValue minAndMaxValue = new MinAndMaxValue();
    int[] values = {1, 3, 6, 45, 654, 54, 65, 465, 465, 46, 54, 564, 87, 9, 8, 900, 78, 54, 21, 32, 5, 4};

    @Test
    public void maxValuePositive() throws Task03Exception {
        int expected = 900;
        int actual = minAndMaxValue.maxValue(values);
        assertEquals(expected, actual);
    }

    @Test
    public void minValuePositive() throws Task03Exception {
        int expected = 1;
        int actual = minAndMaxValue.minValue(values);
        assertEquals(expected, actual);
    }

    @Test(expected = Task03Exception.class)
    public void minValueException() throws Task03Exception {
        int[] nullValues = null;
        minAndMaxValue.minValue(nullValues);

    }
}