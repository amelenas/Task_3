package test.stepanovichalena.task_03.task0303;

import by.stepanovichalena.task_03.exception.Task03Exception;
import by.stepanovichalena.task_03.task0303.logic.ChangeLetterAfterR;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChangeLetterAfterRTest {
    ChangeLetterAfterR changeLetterAfter = new ChangeLetterAfterR();

    @Test
    public void changeLetterAfterR() throws Task03Exception {
        String text = "Рарарарара рар рарара рара ровоы";
        String t = changeLetterAfter.changeLetterAfterR(text);
        System.out.println(t);
    }

    @Test
    public void changeLetterAfterRRegular() throws Task03Exception {
        String text = "Рарарарара рар рарара рара ровоы";
        String t = changeLetterAfter.changeLetterAfterRRegular(text);
        System.out.println(t);
    }
}