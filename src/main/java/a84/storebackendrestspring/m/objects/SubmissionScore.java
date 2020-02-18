package a84.storebackendrestspring.m.objects;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class SubmissionScore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int submissionScoreId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "submission_id")
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "submissionId")
    @JsonIdentityReference(alwaysAsId = true)
    @NotNull
    private Submission submission;

    private double score = 0.0;

    public int getSubmissionScoreId() {
        return submissionScoreId;
    }

    public void setSubmissionScoreId(int submissionScoreId) {
        this.submissionScoreId = submissionScoreId;
    }

    public Submission getSubmission() {
        return submission;
    }

    public void setSubmission(Submission submission) {
        this.submission = submission;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public SubmissionScore() {
    }

    public SubmissionScore(int submissionScoreId, Submission submission, double score) {
        this.submissionScoreId = submissionScoreId;
        this.submission = submission;
        this.score = score;
    }
}
