package a84.storebackendrestspring.m.objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SubmittedAnswerScore {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int submittedAnswerScoreId;



}
