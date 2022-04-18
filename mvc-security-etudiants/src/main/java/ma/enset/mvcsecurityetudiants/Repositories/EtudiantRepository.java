package ma.enset.mvcsecurityetudiants.Repositories;

import ma.enset.mvcsecurityetudiants.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

}
