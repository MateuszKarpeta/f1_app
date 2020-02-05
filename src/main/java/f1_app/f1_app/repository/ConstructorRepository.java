package f1_app.f1_app.repository;

import f1_app.f1_app.model.Constructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

import java.util.List;

@Repository
public interface ConstructorRepository extends JpaRepository<Constructor,Long> {

    @Transactional
    @Query(value = "SELECT constructors.name from constructors WHERE constructors .name='McLaren'")
            public List<Constructor> findMclaren ();
}
