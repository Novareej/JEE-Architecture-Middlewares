package ma.enset.jpaassoc.repositories;

import ma.enset.jpaassoc.entities.Consultation;
import ma.enset.jpaassoc.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
    
}
