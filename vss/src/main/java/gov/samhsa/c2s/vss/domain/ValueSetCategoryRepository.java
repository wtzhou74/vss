package gov.samhsa.c2s.vss.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValueSetCategoryRepository extends JpaRepository<ValueSetCategory, Long> {
}
