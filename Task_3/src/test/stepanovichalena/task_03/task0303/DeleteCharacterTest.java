package test.stepanovichalena.task_03.task0303;

import by.stepanovichalena.task_03.exception.Task03Exception;
import by.stepanovichalena.task_03.task0303.logic.DeleteCharacter;
import org.junit.Test;

public class DeleteCharacterTest {
    DeleteCharacter deleteCharacter = new DeleteCharacter();
    String text = "Christmas is one of the most popular holidays on the planet. It seems" +
            " strange but not everybody celebrate such a great holiday. It depends on " +
            "the religion and the culture of people. So, who does not celebrate this holiday?" +
            "Firstly, it’s a religious holiday. Christians commemorate the birth of Christ. So people who " +
            "are neither Christian nor believers don’t have holiday mood on this day." +
            "Besides, other people refuse to take part in Christmas, because they consider " +
            "that this holiday became too commercial.";

    @Test
    public void deleteSymbolsRegular() throws Task03Exception {
        String t = deleteCharacter.deleteSymbols(text);
        System.out.println(t);
    }

    @Test
    public void deleteSymbols() throws Task03Exception {
        String t = deleteCharacter.deleteSymbolsRegular(text);
        System.out.println(t);
    }

    @Test(expected = Task03Exception.class)
    public void SymbolsRegularNull() throws Task03Exception {
        String textNull = null;
        deleteCharacter.deleteSymbolsRegular(textNull);
    }

    @Test(expected = Task03Exception.class)
    public void SymbolsNull() throws Task03Exception {
        String textNull = null; deleteCharacter.deleteSymbols(textNull);
    }
}