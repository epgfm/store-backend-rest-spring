package a84.storebackendrestspring.m.daos;

import a84.storebackendrestspring.m.objects.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerDAO extends JpaRepository<Answer, Integer> {
    Answer findById(int id);
}
