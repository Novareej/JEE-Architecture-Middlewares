package ma.enset.mvcthymeleaf;

import ma.enset.mvcthymeleaf.Repositories.PatientRepository;
import ma.enset.mvcthymeleaf.entities.Patient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class MvcThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(MvcThymeleafApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient(null,"Arij",new Date(),true,20));
            patientRepository.save(new Patient(null,"Bh",new Date(),false,10));
            patientRepository.save(new Patient(null,"Wiam",new Date(),true,30));

            patientRepository.findAll().forEach(p-> System.out.println(p.getNom()));
        };
    }

}
