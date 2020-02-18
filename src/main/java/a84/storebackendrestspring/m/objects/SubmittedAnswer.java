package a84.storebackendrestspring.m.objects;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class SubmittedAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int submittedAnswer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "answer_id")
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "answerId")
    @JsonIdentityReference(alwaysAsId = true)
    @NotNull
    private Answer answer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "submission_id")
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "submissionId")
    @JsonIdentityReference(alwaysAsId = true)
    @NotNull
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
