package a84.storebackendrestspring.m.objects;

import a84.storebackendrestspring.m.QuestionType;

import javax.persistence.*;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int questionId;

    private String text;
    private QuestionType type;

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    private double points;

    @ManyToOne
    @JoinColumn(name = "quizz_id")
    private Quizz quizz;

    public Question() {
    }

    public Question(int questionId, String text, QuestionType type, double points, Quizz quizz) {
        this.questionId = questionId;
        this.text = text;
        this.type = type;
        this.points = points;
        this.quizz = quizz;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public QuestionType getType() {
        return type;
    }

    public void setType(QuestionType type) {
        this.type = type;
    }


    public Quizz getQuizz() {
        return quizz;
    }

    public void setQuizz(Quizz quizz) {
        this.quizz = quizz;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", text='" + text + '\'' +
                ", type=" + type +
                ", points=" + points +
                ", quizz=" + quizz +
                '}';
    }
}
