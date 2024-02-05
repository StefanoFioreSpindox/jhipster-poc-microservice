package it.spindox.jhipsterpoc.products.repository;

import it.spindox.jhipsterpoc.products.domain.Product;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Product entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {}
