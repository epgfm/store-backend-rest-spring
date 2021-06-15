package a84.storebackendrestspring;

import a84.storebackendrestspring.m.QuestionType;
import a84.storebackendrestspring.m.daos.*;
import a84.storebackendrestspring.m.objects.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCrypt;

@SpringBootApplication
public class InitRunner implements CommandLineRunner {

    @Autowired
    QuizzUserDAO quizzUserDAO;
    @Autowired
    QuizzDAO quizzDAO;
    @Autowired
    QuestionDAO questionDAO;
    @Autowired
    AnswerDAO answerDAO;
    @Autowired
    SubmittedAnswerDAO answerInstanceDAO;
    @Autowired
    SubmissionDAO submissionDAO;
    @Autowired
    SubmissionScoreDAO submissionScoreDAO;

    public void run(String[] args) {

        QuizzUser u = new QuizzUser();
        u.setEmail("recon@s6n.org");
        u.setUserName("ouroumov");
        String admin_pw = BCrypt.hashpw("lolwoot", BCrypt.gensalt(12));
        u.setHashedPassword(admin_pw);
        u.setRoles("ADMIN,USER");
        u.setActive(true);
        quizzUserDAO.save(u);

        Quizz qz = new Quizz();
        qz.setName("Hello World!");
        qz.setDescription("A first quizz to warm this shit up.");
        quizzDAO.save(qz);

        Question q = new Question();
        q.setText("What is E's email address?");
        q.setType(QuestionType.TEXT_EXACT);
        q.setQuizz(qz);
        q.setPoints(5.0);
        questionDAO.save(q);

        Answer a = new Answer();
        a.setText("etienne.papegnies@avenir-84.org");
        a.setQuestion(q);
        a.setTruthValue(true);
        answerDAO.save(a);

        Submission s = new Submission();
        s.setQuizz(qz);
        s.setQuizzUser(u);
        submissionDAO.save(s);

        SubmittedAnswer sa = new SubmittedAnswer();
        sa.setAnswer(a);
        sa.setSubmission(s);
        answerInstanceDAO.save(sa);

        SubmissionScore sc = new SubmissionScore();
        sc.setSubmission(s);
        submissionScoreDAO.save(sc);

    }

}
