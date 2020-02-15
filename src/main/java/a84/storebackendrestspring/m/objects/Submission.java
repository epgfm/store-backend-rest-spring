package a84.storebackendrestspring.m.objects;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Submission {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int submissionId;

    @ManyToOne
    @JoinColumn(name = "quizz_id")
    private Quizz quizz;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private QuizzUser quizzUser;

    private Date date;


    public int getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(int submissionId) {
        this.submissionId = submissionId;
    }

    public Quizz getQuizz() {
        return quizz;
    }

    public void setQuizz(Quizz quizz) {
        this.quizz = quizz;
    }

    public QuizzUser getQuizzUser() {
        return quizzUser;
    }

    public void setQuizzUser(QuizzUser quizzUser) {
        this.quizzUser = quizzUser;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "QuizzSubmission{" +
                "submissionId=" + submissionId +
                ", quizz=" + quizz +
                ", quizzUser=" + quizzUser +
                ", date=" + date +
                '}';
    }
}
