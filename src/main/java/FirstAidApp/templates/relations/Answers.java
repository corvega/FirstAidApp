package FirstAidApp.templates.relations;

import java.util.ArrayList;

public class Answers {
    private String correctAnswer;
    private ArrayList<String> fakeAnswers;

    public Answers(String correctAnswer, ArrayList<String> fakeAnswers) {
        if (fakeAnswers.size() != 3) throw new Error("Fake answer array must be of length 3");
        this.correctAnswer = correctAnswer;
        this.fakeAnswers = fakeAnswers;
    }

    public Answers(String correctAnswer, String fakeAnswer1, String fakeAnswer2, String fakeAnswer3) {
        this.correctAnswer = correctAnswer;
        this.fakeAnswers = new ArrayList();
        this.fakeAnswers.add(fakeAnswer1);
        this.fakeAnswers.add(fakeAnswer2);
        this.fakeAnswers.add(fakeAnswer3);
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public ArrayList<String> getFakeAnswers() {
        return fakeAnswers;
    }

    public String getFakeAnswer(int index) {
        return this.fakeAnswers.get(index);
    }

    public void setFakeAnswers(ArrayList<String> fakeAnswers) {
        this.fakeAnswers = fakeAnswers;
    }
}
