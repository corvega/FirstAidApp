package FirstAidApp.templates;



import FirstAidApp.templates.relations.Answers;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class QuizTest {
    /* TODO: I don't know how to check if the class is correct because creating a new class gives it a different memory address */

    @Test
    public void getTitle() {
        Quiz quiz = new Quiz("a", "b", "c", "d", "e", "f");
        assertEquals(quiz.getTitle(), "a");
    }

    @Test
    public void getQuestion() {
        Quiz quiz = new Quiz("a", "b", "c", "d", "e", "f");
        assertEquals(quiz.getQuestion(), "b");
    }

    @Test
    public void getFakeAnswer() {
        Quiz quiz = new Quiz("a", "b", "c", "d", "e", "f");
        assertEquals(quiz.getFakeAnswer(0), "d");
    }
}