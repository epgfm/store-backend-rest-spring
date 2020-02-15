package a84.storebackendrestspring.m.objects;

import javax.persistence.*;

@Entity
public class SubmittedAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int submittedAnswer;

    @ManyToOne
    @JoinColumn(name = "answer_id")
    private Answer answer;

    @ManyToOne
    @JoinColumn(name = "submission_id")
    private Submission submission;

    public SubmittedAnswer() {
    }

    public SubmittedAnswer(int submittedAnswer, Answer answer, Submission submission) {
        this.submittedAnswer = submittedAnswer;
        this.answer = answer;
        this.submission = submission;
    }

    public int getSubmittedAnswer() {
        return submittedAnswer;
    }

    public void setSubmittedAnswer(int submittedAnswer) {
        this.submittedAnswer = submittedAnswer;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public Submission getSubmission() {
        return submission;
    }

    public void setSubmission(Submission submission) {
        this.submission = submission;
    }

    @Override
    public String toString() {
        return "AnswerInstance{" +
                "answerInstanceId=" + submittedAnswer +
                ", answer=" + answer +
                ", submission=" + submission +
                '}';
    }
}
