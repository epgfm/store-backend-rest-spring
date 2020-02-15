package a84.storebackendrestspring.m.objects;

import javax.persistence.*;

@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int answerId;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
    private String text;
    private boolean truthValue;


    public Answer() {
    }

    public Answer(int answerId, Question question, String text, boolean truthValue) {
        this.answerId = answerId;
        this.question = question;
        this.text = text;
        this.truthValue = truthValue;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public boolean isTruthValue() {
        return truthValue;
    }

    public void setTruthValue(boolean truthValue) {
        this.truthValue = truthValue;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answerId=" + answerId +
                ", question=" + question +
                ", text='" + text + '\'' +
                ", truthValue=" + truthValue +
                '}';
    }
}
