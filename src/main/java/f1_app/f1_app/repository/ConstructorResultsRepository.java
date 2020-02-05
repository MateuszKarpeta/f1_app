package f1_app.f1_app.repository;

import f1_app.f1_app.model.ConstructorResults;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstructorResultsRepository extends JpaRepository<ConstructorResults,Long> {
}
