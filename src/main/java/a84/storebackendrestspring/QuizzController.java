package a84.storebackendrestspring;

import a84.storebackendrestspring.m.daos.*;
import a84.storebackendrestspring.m.objects.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuizzController {

    @Autowired
    QuizzUserDAO quizzUserDAO;
    @Autowired
    QuizzDAO quizzDAO;
    @Autowired
    QuestionDAO questionDAO;
    @Autowired
    AnswerDAO answerDAO;
    @Autowired
    SubmittedAnswerDAO submittedAnswerDAO;
    @Autowired
    SubmissionDAO submissionDAO;


    @GetMapping("/quizzes")
    List<Quizz> getAllQuizzes() {
        return quizzDAO.findAll();
    }
    @GetMapping("/quizz/{id}")
    Quizz getQuizzById(@PathVariable int id) {
        return quizzDAO.findById(id);
    }

    @GetMapping("/answers")
    List<Answer> getAllAnswers() { return answerDAO.findAll(); }
    @GetMapping("/answer/{id}")
    Answer getAnswerById(@PathVariable int id) {
        return answerDAO.findById(id);
    }

    @GetMapping("/questions")
    List<Question> getAllQuestions() {
        return questionDAO.findAll();
    }
    @GetMapping("/question/{id}")
    Question getQuestionById(@PathVariable int id) {
        return questionDAO.findById(id);
    }

    @GetMapping("/quizzusers")
    List<QuizzUser> getAllQuizzUsers() {
        return quizzUserDAO.findAll();
    }
    @GetMapping("/quizzusers/{id}")
    QuizzUser getQuizzUserById(@PathVariable int id) {
        return quizzUserDAO.findById(id);
    }


    @GetMapping("/submittedanswers")
    List<SubmittedAnswer> getAllSubmittedAnswers() {
        return submittedAnswerDAO.findAll();
    }
    @GetMapping("/submittedanswer/{id}")
    SubmittedAnswer getSubmittedAnswerById(@PathVariable int id) {
        return submittedAnswerDAO.findById(id);
    }


    @GetMapping("/submissions")
    List<Submission> getAllSubmissions() {
        return submissionDAO.findAll();
    }
    @GetMapping("/submission/{id}")
    Submission getSubmissionById(@PathVariable int id) {
        return submissionDAO.findById(id);
    }



}
