package a84.storebackendrestspring.m.daos;

import a84.storebackendrestspring.m.objects.Submission;
import a84.storebackendrestspring.m.objects.SubmissionScore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubmissionScoreDAO extends JpaRepository<SubmissionScore, Integer> {
    SubmissionScore findById(int id);
}
