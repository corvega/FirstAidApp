package FirstAidApp.templates.relations;

import java.util.ArrayList;

/**
 * This is the model class for the answers
 */
public class Answers {
    private String correctAnswer;
    private ArrayList<String> fakeAnswers;

    /**
     * Constructor
     * @param correctAnswer the answer which will be correct
     * @param fakeAnswers the answers that will be incorrect
     */
    public Answers(String correctAnswer, ArrayList<String> fakeAnswers) {
        if (fakeAnswers.size() != 3) throw new Error("Fake answer array must be of length 3");
        this.correctAnswer = correctAnswer;
        this.fakeAnswers = fakeAnswers;
    }

    /**
     * Constructor
     * @param correctAnswer the answer which will be correct.
     * @param fakeAnswer1 answer that will be incorrect.
     * @param fakeAnswer2 answer that will be incorrect.
     * @param fakeAnswer3 answer that will be incorrect.
     */
    public Answers(String correctAnswer, String fakeAnswer1, String fakeAnswer2, String fakeAnswer3) {
        this.correctAnswer = correctAnswer;
        this.fakeAnswers = new ArrayList();
        this.fakeAnswers.add(fakeAnswer1);
        this.fakeAnswers.add(fakeAnswer2);
        this.fakeAnswers.add(fakeAnswer3);
    }

    /**
     * Getter for the correct answer
     * @return the correct answer
     */
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    /**
     * Getter for the fake answers
     * @return all the fake answers
     */
    public ArrayList<String> getFakeAnswers() {
        return fakeAnswers;
    }

    /**
     * Getter for a fake answer
     * @param index of the fake answer that is wanted to be returned.
     * @return the fake answer at the given index.
     */
    public String getFakeAnswer(int index) {
        return this.fakeAnswers.get(index);
    }
}
