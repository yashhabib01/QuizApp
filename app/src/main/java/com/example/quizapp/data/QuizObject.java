package com.example.quizapp.data;

public class QuizObject {
    private String question;
    private String [] options;
    private int ans;

    public QuizObject(String question, String[] options, int ans) {
        this.question = question;
        this.options = options;
        this.ans = ans;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }
}
