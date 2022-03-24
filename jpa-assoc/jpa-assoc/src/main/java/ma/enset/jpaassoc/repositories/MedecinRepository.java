package ma.enset.jpaassoc.repositories;

import ma.enset.jpaassoc.entities.Medecin;
import ma.enset.jpaassoc.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
    
}
