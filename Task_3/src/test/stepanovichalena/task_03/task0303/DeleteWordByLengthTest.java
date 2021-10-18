package test.stepanovichalena.task_03.task0303;

import by.stepanovichalena.task_03.exception.Task03Exception;
import by.stepanovichalena.task_03.task0303.logic.DeleteWordByLength;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeleteWordByLengthTest {
    DeleteWordByLength deleteWordByLength = new DeleteWordByLength();

    @Test
    public void deleteWordByLengthRegular() throws Task03Exception {
        String text = "Christmas is one of the most popular holidays on the planet. It seems" +
                " strange but not everybody celebrate such a great holiday. It depends on " +
                "the religion and the culture of people. So, who does not celebrate this holiday?" +
                "Firstly, it’s a religious holiday. Christians commemorate the birth of Christ. ";

        String result = deleteWordByLength.deleteWordByLengthRegular(text, 4);
        System.out.println(result);
    }

    @Test
    public void deleteWordByLength() throws Task03Exception {
        String text = "Christmas is one of the most popular holidays on the planet. It seems" +
                " strange but not everybody celebrate such a great holiday. It depends on " +
                "the religion and the culture of people. So, who does not celebrate this holiday?" +
                "Firstly, it’s a religious holiday. Christians commemorate the birth of Christ. ";

        String result = deleteWordByLength.deleteWordByLength(text, 4);
        System.out.println(result);
    }
}