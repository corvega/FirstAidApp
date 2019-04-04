package FirstAidApp.templates.relations;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AnswersTest {

    @Test
    public void getCorrectAnswer() {
        Answers answers = new Answers("a", "b", "c", "d");
        String value = answers.getCorrectAnswer();
        assertEquals(value, "a");
    }

    @Test
    public void getFakeAnswers() {
        Answers answers = new Answers("a", "b", "c", "d");
        ArrayList<String> expected = new ArrayList();
        expected.add("b");
        expected.add("c");
        expected.add("d");

        assertEquals(answers.getFakeAnswers().equals(expected), true);
    }

    @Test
    public void getFakeAnswer() {
        Answers answers = new Answers("a", "b", "c", "d");
        assertEquals(answers.getFakeAnswer(0), "b");
    }
}