package a84.storebackendrestspring.m.objects;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int answerId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "questionId")
    @JsonIdentityReference(alwaysAsId = true)
    @NotNull
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
