package a84.storebackendrestspring;

import a84.storebackendrestspring.m.QuestionType;
import a84.storebackendrestspring.m.daos.*;
import a84.storebackendrestspring.m.objects.*;
import a84.storebackendrestspring.m.store.ProductDAO;
import a84.storebackendrestspring.m.store.ProductFeedbackDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InitRunner implements CommandLineRunner {

    @Autowired
    ProductDAO productDAO;
    @Autowired
    ProductFeedbackDAO productFeedbackDAO;

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

    public void run(String[] args) {

        QuizzUser u = new QuizzUser();
        u.setEmail("recon@s6n.org");
        u.setName("ouroumov");
        u.setHashedPassword("lolhash");
        u.setSalt("salthash");
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


//
//        System.out.println("[Start] Preloading database.");
//        Product[] products = new Product[] {
//            new Product("AcerV-6", 105, "Screen"),
//            new Product("Brix NUC", 300.6, "Mini-pc"),
//            new Product("Concrad RX7", 10.2, "Cat7 Cable")
//        };
//        for (int i = 0; i < products.length; i++)
//            products[i] = productDAO.save(products[i]);
//        System.out.println("[Done] Preloading database.");
//
//        System.out.println("[Start] Adding feedbacks.");
//        for (int i = 0; i < products.length; i++) {
//            ProductFeedback[] pfs = new ProductFeedback[] {
//                    new ProductFeedback(
//                            products[i],
//                            "This " + products[i].getName() + " is great shit"
//                    ),
//                    new ProductFeedback(
//                            products[i],
//                            "Meh " + products[i].getName() + " sucks"
//                    ),
//            };
//            for (ProductFeedback pf: pfs)
//                productFeedbackDAO.save(pf);
//        }
//        System.out.println("[Done] Adding feedbacks.");


    }

}
