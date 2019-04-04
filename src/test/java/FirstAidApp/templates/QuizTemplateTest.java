package FirstAidApp.templates;



import FirstAidApp.templates.relations.Answers;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class QuizTemplateTest {
    /* TODO: I don't know how to check if the class is correct because creating a new class gives it a different memory address */

    @Test
    public void getTitle() {
        QuizTemplate quizTemplate = new QuizTemplate("a", "b", "c", "d", "e", "f");
        assertEquals(quizTemplate.getTitle(), "a");

        Answers answers = new Answers("c", "d", "e", "f");
        QuizTemplate quiz = new QuizTemplate("a", "b", answers);
        assertEquals(quiz.getTitle(), "a");
    }

    @Test
    public void getQuestion() {
        QuizTemplate quizTemplate = new QuizTemplate("a", "b", "c", "d", "e", "f");
        assertEquals(quizTemplate.getQuestion(), "b");

        Answers answers = new Answers("c", "d", "e", "f");
        QuizTemplate quiz = new QuizTemplate("a", "b", answers);
        assertEquals(quiz.getQuestion(), "b");
    }

    @Test
    public void getFakeAnswers() {
        QuizTemplate quiz = new QuizTemplate("a","b","c","d","e","f");
        ArrayList<String> fakeAnswers = new ArrayList();
        fakeAnswers.add("d");
        fakeAnswers.add("e");
        fakeAnswers.add("f");
        Answers answers = new Answers("c", fakeAnswers);
        assertEquals(quiz.getFakeAnswers().equals(fakeAnswers), true);
    }

    @Test
    public void getFakeAnswer() {
        QuizTemplate quizTemplate = new QuizTemplate("a", "b", "c", "d", "e", "f");
        assertEquals(quizTemplate.getFakeAnswer(0), "d");

        Answers answers = new Answers("c", "d", "e", "f");
        QuizTemplate quiz = new QuizTemplate("a", "b", answers);
        assertEquals(quiz.getFakeAnswer(0), "b");
    }
}