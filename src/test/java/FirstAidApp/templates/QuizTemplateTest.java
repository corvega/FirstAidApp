package FirstAidApp.templates;



import org.junit.Test;

import static org.junit.Assert.*;

public class QuizTemplateTest {
    /* TODO: I don't know how to check if the class is correct because creating a new class gives it a different memory address */

    @Test
    public void getTitle() {
        QuizTemplate quizTemplate = new QuizTemplate("a", "b", "c", "d", "e", "f");
        assertEquals(quizTemplate.getTitle(), "a");
    }

    @Test
    public void getQuestion() {
        QuizTemplate quizTemplate = new QuizTemplate("a", "b", "c", "d", "e", "f");
        assertEquals(quizTemplate.getQuestion(), "b");
    }

    @Test
    public void getFakeAnswer() {
        QuizTemplate quizTemplate = new QuizTemplate("a", "b", "c", "d", "e", "f");
        assertEquals(quizTemplate.getFakeAnswer(0), "d");
    }
}