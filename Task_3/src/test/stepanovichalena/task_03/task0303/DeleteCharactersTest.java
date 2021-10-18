package test.stepanovichalena.task_03.task0303;

import by.stepanovichalena.task_03.exception.Task03Exception;
import by.stepanovichalena.task_03.task0303.logic.DeleteCharacters;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeleteCharactersTest {
    DeleteCharacters deleteCharacters = new DeleteCharacters();
    String text = "Christmas is one of the most popular holidays on the planet. It seems" +
            " strange but not everybody celebrate such a great holiday. It depends on " +
            "the religion and the culture of people. So, who does not celebrate this holiday?" +
            "Firstly, it’s a religious holiday. Christians commemorate the birth of Christ. So people who " +
            "are neither Christian nor believers don’t have holiday mood on this day." +
            "Besides, other people refuse to take part in Christmas, because they consider " +
            "that this holiday became too commercial.";

    @Test
    public void deleteCharactersRegular() throws Task03Exception {
        String t = deleteCharacters.deleteCharacters(text);
        System.out.println(t);
    }

    @Test
    public void deleteCharacters() throws Task03Exception {
        String t = deleteCharacters.deleteCharactersRegular(text);
        System.out.println(t);
    }
}