package a84.storebackendrestspring.m.daos;

import a84.storebackendrestspring.m.objects.QuizzUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizzUserDAO extends JpaRepository<QuizzUser, Integer> {
    QuizzUser findById(int id);
    QuizzUser findByUserName(String name);
}
