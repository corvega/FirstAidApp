package FirstAidApp.templates;

import FirstAidApp.templates.relations.Answers;

import java.util.ArrayList;

/**
 * Model for the Quiz
 */
public class QuizTemplate {
    String title;
    String question;
    Answers answers;

    /**
     * Constructor
     * @param title for the quiz
     * @param question for the quiz
     * @param answers for the quiz
     */
    public QuizTemplate(String title, String question, Answers answers) {
        this.title = title;
        this.question = question;
        this.answers = answers;
    }

    /**
     * Constructor
     * @param title for the quiz
     * @param question for the quiz
     * @param correctAnswer for the quiz
     * @param fakeAnswers for the quiz
     */
    public QuizTemplate(String title, String question, String correctAnswer, ArrayList<String> fakeAnswers) {
        if (fakeAnswers.size() != 3) throw new Error("Fake Answer array must be of length 3");
        this.title = title;
        this.question = question;
        this.answers = new Answers(correctAnswer, fakeAnswers);
    }

    /**
     * Constructor
     * @param title for the quiz
     * @param question for the quiz
     * @param correctAnswer for the quiz
     * @param fakeAnswer1 for the quiz
     * @param fakeAnswer2 for the quiz
     * @param fakeAnswer3 for the quiz
     */
    public QuizTemplate(String title, String question, String correctAnswer, String fakeAnswer1, String fakeAnswer2, String fakeAnswer3) {
        this.title = title;
        this.question = question;
        this.answers = new Answers(correctAnswer, fakeAnswer1, fakeAnswer2, fakeAnswer3);
    }

    /**
     * Getter for the title
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Getter for the question
     * @return question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Getter for the answers
     * @return answers
     */
    public Answers getAnswers() {
        return answers;
    }

    /**
     * Getter for the fake answers
     * @return fake answers
     */
    public ArrayList<String> getFakeAnswers() {
        return this.answers.getFakeAnswers();
    }

    /**
     * Getter for a fake answer
     * @param index of fake answer that is wanted to be returned.
     * @return fake answer
     */
    public String getFakeAnswer(int index) {
        return this.answers.getFakeAnswer(index);
    }

    /**
     * Getter for the correct answer
     * @return the correct answer
     */
    public String getCorrectAnswer() {
        return this.answers.getCorrectAnswer();
    }
}

