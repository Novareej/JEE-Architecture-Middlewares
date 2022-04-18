package ma.enset.mvcsecurityetudiants;

import ma.enset.mvcsecurityetudiants.Repositories.EtudiantRepository;
import ma.enset.mvcsecurityetudiants.entities.Etudiant;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class MvcSecurityEtudiantsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MvcSecurityEtudiantsApplication.class, args);
    }

        @Bean
        CommandLineRunner commandLineRunner(EtudiantRepository etudiantRepository){
            return a->{
                etudiantRepository.save(new Etudiant(null,"Bh","Arij","bouhlalaarij@gmail.com",'F',new Date(),true));
                etudiantRepository.save(new Etudiant(null,"Af","Ikram","afif@gmail.com",'F',new Date(),true));
                etudiantRepository.save(new Etudiant(null,"Toto","Ra","totra@gmail.com",'M',new Date(),false));
                etudiantRepository.save(new Etudiant(null,"Mem","Dom","mode@gmail.com",'M',new Date(),false));

                etudiantRepository.findAll().forEach(p->{
                    System.out.println(p.getNom());
                });
            };
        }
}
