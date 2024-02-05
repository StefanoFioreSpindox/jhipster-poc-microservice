package it.spindox.jhipsterpoc.products.repository;

import it.spindox.jhipsterpoc.products.domain.Category;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Category entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {}
