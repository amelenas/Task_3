package test.stepanovichalena.task_03.task0303;

import by.stepanovichalena.task_03.exception.Task03Exception;
import by.stepanovichalena.task_03.task0303.logic.ChangeLetterAfterR;
import org.junit.Test;

public class ChangeLetterAfterRTest {
    ChangeLetterAfterR changeLetterAfter = new ChangeLetterAfterR();

    @Test
    public void changeLetterAfterR() throws Task03Exception {
        String text = "РарAРAрара РОРОРАРАРА";
        String result = changeLetterAfter.changeLetterAfterR(text, "Ра", "Ро");
        System.out.println(result);
    }

    @Test
    public void changeLetterAfterRRegular() throws Task03Exception {
        String text = "РарAРAрара РОРОРАРАРА";
        String result = changeLetterAfter.changeLetterAfterRRegular(text);
        System.out.println(result);
    }

    @Test(expected = Task03Exception.class)
    public void changeLetterNull() throws Task03Exception {
        String text = null;
        String result = changeLetterAfter.changeLetterAfterRRegular(text);
        System.out.println(result);
    }
}