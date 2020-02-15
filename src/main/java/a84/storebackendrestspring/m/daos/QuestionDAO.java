package a84.storebackendrestspring.m.daos;

import a84.storebackendrestspring.m.objects.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionDAO extends JpaRepository<Question, Integer> {
    Question findById(int id);
}
