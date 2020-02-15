package a84.storebackendrestspring.m.daos;

import a84.storebackendrestspring.m.objects.Quizz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizzDAO extends JpaRepository<Quizz, Integer> {
    Quizz findById(int id);
}
