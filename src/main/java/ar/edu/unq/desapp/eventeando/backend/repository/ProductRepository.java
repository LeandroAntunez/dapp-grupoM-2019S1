package ar.edu.unq.desapp.eventeando.backend.repository;

import ar.edu.unq.desapp.eventeando.backend.model.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}