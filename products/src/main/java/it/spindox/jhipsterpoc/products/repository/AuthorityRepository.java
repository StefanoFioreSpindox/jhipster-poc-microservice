package it.spindox.jhipsterpoc.products.repository;

import it.spindox.jhipsterpoc.products.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
