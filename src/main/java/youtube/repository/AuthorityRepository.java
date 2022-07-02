package youtube.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import youtube.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
