package a84.storebackendrestspring.m.store;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductFeedbackDAO extends JpaRepository<ProductFeedback, Integer> {

    List<ProductFeedback> findAllByProduct(Product product);
}
