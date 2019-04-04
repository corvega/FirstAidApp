package FirstAidApp.templates;

import FirstAidApp.templates.relations.Answers;

import java.util.ArrayList;

public class Quiz {
    String title;
    String question;
    Answers answers;

    public Quiz(String title, String question, Answers answers) {
        this.title = title;
        this.question = question;
        this.answers = answers;
    }

    public Quiz(String title, String question, String correctAnswer, ArrayList<String> fakeAnswers) {
        if (fakeAnswers.size() != 3) throw new Error("Fake Answer array must be of length 3");
        this.title = title;
        this.question = question;
        this.answers = new Answers(correctAnswer, fakeAnswers);
    }

    public Quiz(String title, String question, String correctAnswer, String fakeAnswer1, String fakeAnswer2, String fakeAnswer3) {
        this.title = title;
        this.question = question;
        this.answers = new Answers(correctAnswer, fakeAnswer1, fakeAnswer2, fakeAnswer3);
    }

    public String getTitle() {
        return title;
    }

    public String getQuestion() {
        return question;
    }

    public Answers getAnswers() {
        return answers;
    }

    public ArrayList<String> getFakeAnswers() {
        return this.answers.getFakeAnswers();
    }

    public String getFakeAnswer(int index) {
        return this.answers.getFakeAnswer(index);
    }

    public String getCorrectAnswer() {
        return this.answers.getCorrectAnswer();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}

