package a84.storebackendrestspring.m.store;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDAO extends JpaRepository<Product, Integer> {
    Product findById(int id);
}
