package FakeDatabase;

import java.util.ArrayList;

/**
 * Quiz
 */
public class Quiz {

  public String title;
  public ArrayList<String> questions;
  public ArrayList<String> answers;

  public Quiz(String title, ArrayList<String> questions, ArrayList<String> answers) {
    this.title = title;
    this.questions = questions;
    this.answers = answers;
  }

  public String getTitle() {
    return this.title;
  }

  public ArrayList<String> getQuestions() {
    return this.questions;
  }

  public ArrayList<String> getAnswers() {
    return this.answers;
  }

  public String getQuestion(int index) {
    return this.questions.get(index);
  }

  public String getAnswer(int index) {
    return this.answers.get(index);
  }

}