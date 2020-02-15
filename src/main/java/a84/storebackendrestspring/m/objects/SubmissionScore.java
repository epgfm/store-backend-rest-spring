package a84.storebackendrestspring.m.objects;

import javax.persistence.*;

@Entity
public class SubmissionScore {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int submissionScoreId;

    @ManyToOne
    @JoinColumn(name = "submission_id")
    private Submission submission;

    private double score;

}
