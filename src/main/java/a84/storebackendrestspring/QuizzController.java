package a84.storebackendrestspring;

import a84.storebackendrestspring.m.daos.*;
import a84.storebackendrestspring.m.objects.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @Autowired
    SubmissionScoreDAO submissionScoreDAO;


    @GetMapping("/quizzes")
    List<Quizz> getAllQuizzes() {
        return quizzDAO.findAll();
    }
    @GetMapping("/quizz/{id}")
    Quizz getQuizzById(@PathVariable int id) {
        return quizzDAO.findById(id);
    }
    @PostMapping("/quizz/add")
    Quizz newQuizz(@RequestBody Quizz q) {
        Quizz res = null;
        try {
            res = quizzDAO.save(q);
        } catch (Exception e) {
            System.out.print(e);
        }
        return res;
    }


    @GetMapping("/questions")
    List<Question> getAllQuestions() {
        return questionDAO.findAll();
    }
    @GetMapping("/question/{id}")
    Question getQuestionById(@PathVariable int id) {
        return questionDAO.findById(id);
    }
    @PostMapping("/question/add")
    Question newQuestion(@RequestBody Question qu) {
        Question res = null;
        try {
            res = questionDAO.save(qu);
        } catch (Exception e) {
            System.out.print(e);
        }
        return res;
    }

    @GetMapping("/answers")
    List<Answer> getAllAnswers() { return answerDAO.findAll(); }
    @GetMapping("/answer/{id}")
    Answer getAnswerById(@PathVariable int id) {
        return answerDAO.findById(id);
    }
    @PostMapping("/answer/add")
    Answer newAnswer(@RequestBody Answer a) {
        Answer res = null;
        try {
            res = answerDAO.save(a);
        } catch (Exception e) {
            System.out.print(e);
        }
        return res;
    }




    @GetMapping("/quizzusers")
    List<QuizzUser> getAllQuizzUsers() {
        return quizzUserDAO.findAll();
    }
    @GetMapping("/quizzuser/{id}")
    QuizzUser getQuizzUserById(@PathVariable int id) {
        return quizzUserDAO.findById(id);
    }
    @PostMapping("/quizzuser/add")
    QuizzUser newQuizzUser(@RequestBody QuizzUser u) {
        QuizzUser res = null;
        try {
            res = quizzUserDAO.save(u);
        } catch (Exception e) {
            System.out.print(e);
        }
        return res;
    }


    @GetMapping("/submittedanswers")
    List<SubmittedAnswer> getAllSubmittedAnswers() {
        return submittedAnswerDAO.findAll();
    }
    @GetMapping("/submittedanswer/{id}")
    SubmittedAnswer getSubmittedAnswerById(@PathVariable int id) {
        return submittedAnswerDAO.findById(id);
    }
    @PostMapping("/submittedanswer/add")
    SubmittedAnswer newSubmittedAnswer(@RequestBody SubmittedAnswer sa) {
        SubmittedAnswer res = null;
        try {
            res = submittedAnswerDAO.save(sa);
        } catch (Exception e) {
            System.out.print(e);
        }
        return res;
    }


    @GetMapping("/submissions")
    List<Submission> getAllSubmissions() {
        return submissionDAO.findAll();
    }
    @GetMapping("/submission/{id}")
    Submission getSubmissionById(@PathVariable int id) {
        return submissionDAO.findById(id);
    }
    @PostMapping("/submission/add")
    Submission newSubmission(@RequestBody Submission s) {
        Submission res = null;
        try {
            res = submissionDAO.save(s);
        } catch (Exception e) {
            System.out.print(e);
        }
        return res;
    }


    @GetMapping("/submissionscores")
    List<SubmissionScore> getAllSubmissionScores() {
        return submissionScoreDAO.findAll();
    }
    @GetMapping("/submissionscore/{id}")
    SubmissionScore getSubmissionScoreById(@PathVariable int id) {
        return submissionScoreDAO.findById(id);
    }
    @PostMapping("/submissionscore/add")
    SubmissionScore newSubmissionScore(@RequestBody SubmissionScore ss) {
        SubmissionScore res = null;
        try {
            res = submissionScoreDAO.save(ss);
        } catch (Exception e) {
            System.out.print(e);
        }
        return res;
    }



}
