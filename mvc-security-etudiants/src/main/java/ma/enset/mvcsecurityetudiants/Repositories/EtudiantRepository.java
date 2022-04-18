package ma.enset.mvcsecurityetudiants.Repositories;

import ma.enset.mvcsecurityetudiants.entities.Etudiant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

    Page<Etudiant> findByNomContains(String keyword, Pageable pageable);
}
