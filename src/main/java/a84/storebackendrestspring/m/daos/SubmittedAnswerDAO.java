package a84.storebackendrestspring.m.daos;

import a84.storebackendrestspring.m.objects.SubmittedAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubmittedAnswerDAO extends JpaRepository<SubmittedAnswer, Integer> {
    SubmittedAnswer findById(int id);
}
