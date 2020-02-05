package f1_app.f1_app.repository;

import f1_app.f1_app.model.ConstructorStandings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface ConstructorStandingsRepository extends JpaRepository<ConstructorStandings,Long> {




}
