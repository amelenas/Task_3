package test.stepanovichalena.task_03.task0303;

import by.stepanovichalena.task_03.exception.Task03Exception;
import by.stepanovichalena.task_03.task0303.logic.ReplaceKSymbol;
import org.junit.Test;

public class ReplaceKSymbolTest {
ReplaceKSymbol replaceKSymbol = new ReplaceKSymbol();

    @Test
    public void replaceSymbol() throws Task03Exception {
        String text = "Christmas is one of the most popular holidays on the planet. It seems" +
                " strange but not everybody celebrate such a great holiday. It depends on " +
                "the religion and the culture of people. So, who does not celebrate this holiday?" +
                "Firstly, it’s a religious holiday. Christians commemorate the birth of Christ. ";
        String result = replaceKSymbol.replaceSymbol(text, 1, '*');
        System.out.println(result);
    }

    @Test
    public void replaceSymbolRegular() throws Task03Exception {
        String text = "Christmas is one of the most popular holidays on the planet. It seems" +
                " strange but not everybody celebrate such a great holiday. It depends on " +
                "the religion and the culture of people. So, who does not celebrate this holiday?" +
                "Firstly, it’s a religious holiday. Christians commemorate the birth of Christ. ";
        String result = replaceKSymbol.replaceSymbolRegular(text, 1, '*');
        System.out.println(result);
    }

    @Test (expected = Task03Exception.class)
    public void replaceSymbolNull() throws Task03Exception {
        String text = null;
        String result = replaceKSymbol.replaceSymbol(text, 1, '*');
        System.out.println(result);
    }

    @Test (expected = Task03Exception.class)
    public void replaceSymbolRegularNull() throws Task03Exception {
        String text = null;
        String result = replaceKSymbol.replaceSymbolRegular(text, 1, '*');
        System.out.println(result);
    }

    @Test (expected = Task03Exception.class)
    public void replaceSymbolNegativeIndex() throws Task03Exception {
        String text = "Christmas is one of the most popular holidays on the planet. It seems" +
                " strange but not everybody celebrate such a great holiday. It depends on " +
                "the religion and the culture of people. So, who does not celebrate this holiday?" +
                "Firstly, it’s a religious holiday. Christians commemorate the birth of Christ. ";
        String result = replaceKSymbol.replaceSymbol(text, -1, '*');
        System.out.println(result);
    }

    @Test (expected = Task03Exception.class)
    public void replaceSymbolRegularNegativeIndex() throws Task03Exception {
        String text = "Christmas is one of the most popular holidays on the planet. It seems" +
                " strange but not everybody celebrate such a great holiday. It depends on " +
                "the religion and the culture of people. So, who does not celebrate this holiday?" +
                "Firstly, it’s a religious holiday. Christians commemorate the birth of Christ. ";
        String result = replaceKSymbol.replaceSymbolRegular(text, -1, '*');
        System.out.println(result);
    }
}