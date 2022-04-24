package ma.enset.mvcthymeleaf.Repositories;

import ma.enset.mvcthymeleaf.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {


}
