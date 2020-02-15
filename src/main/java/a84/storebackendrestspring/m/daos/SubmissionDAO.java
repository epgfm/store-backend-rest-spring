package a84.storebackendrestspring.m.daos;

import a84.storebackendrestspring.m.objects.Submission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubmissionDAO extends JpaRepository<Submission, Integer> {

    Submission findById(int id);
}
