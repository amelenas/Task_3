package test.stepanovichalena.task_03.task0303;

import by.stepanovichalena.task_03.exception.Task03Exception;
import by.stepanovichalena.task_03.task0303.logic.ReplaceWordOnSubstring;
import org.junit.Test;

public class ReplaceWordOnSubstringTest {

    ReplaceWordOnSubstring replaceWordOnSubstring = new ReplaceWordOnSubstring();

    @Test
    public void replaceWordsRegular() throws Task03Exception {
        String text = "Christmas is one of the most popular holidays on the planet. It seems" +
            " strange but not everybody celebrate such a great holiday. It depends on " +
            "the religion and the culture of people. So, who does not celebrate this holiday?" +
            "Firstly, it’s a religious holiday. Christians commemorate the birth of Christ. ";


        String result = replaceWordOnSubstring.replaceWordsRegular(text,7, "*******");
        System.out.println(result);
    }

    @Test
    public void replaceWords() throws Task03Exception {
        String text = "Christmas is one of the most popular holidays on the planet. It seems" +
                " strange but not everybody celebrate such a great holiday. It depends on " +
                "the religion and the culture of people. So, who does not celebrate this holiday?" +
                "Firstly, it’s a religious holiday. Christians commemorate the birth of Christ. ";

        String result = replaceWordOnSubstring.replaceWords(text,7, "*******");
        System.out.println(result);
    }
}