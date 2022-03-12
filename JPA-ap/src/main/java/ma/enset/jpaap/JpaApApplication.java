package ma.enset.jpaap;

import ma.enset.jpaap.entities.Patient;
import ma.enset.jpaap.repositories.PatientRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class JpaApApplication implements CommandLineRunner {
    @Autowired
    private PatientRepos patientRepos;
    public static void main(String[] args) {

        SpringApplication.run(JpaApApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
       for(int i=0;i<100;i++) {
           patientRepos.save(
                   new Patient(null, "Toto", new Date(), Math.random()>0.5?true:false, 50));
       }

        Page<Patient> patients = patientRepos.findAll(PageRequest.of(0,5));
        List<Patient> bymal = patientRepos.findByMalade(true);
        patients.forEach((p->{
            System.out.println(p.getId());
            System.out.println(p.getNom());
            System.out.println(p.getDateNaissance());
            System.out.println(p.isMalade());
        }));

    }
}
