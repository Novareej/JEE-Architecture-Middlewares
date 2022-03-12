package ma.enset.jpaap.repositories;

import ma.enset.jpaap.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface PatientRepos extends JpaRepository<Patient, Long> {

    public List<Patient> findByMalade(Boolean m);
    @Query("select p from Patient p where p.dateNaissance between  :x and :y or p.nom like :z")
    List<Patient> chercherPatient(@Param("x") Date d1,@Param("y") Date d2,@Param("z")  String nom);
}
