package arij.bouhlala;

import arij.bouhlala.entités.*;
import arij.bouhlala.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class BouhlalaArijApplication {

    public static void main(String[] args) {
        SpringApplication.run(BouhlalaArijApplication.class, args);
    }

    @Bean
    public CommandLineRunner start(SessionRepository sessionRepository,
                                   ConferenceRepository conferenceRepository,
                                   InscriptionRepository inscriptionRepository,
                                   ParticipantRepository participantRepository,
                                   ModerateurRepository moderateurRepository){
        return args -> {
            Stream.of("Devoxx","Hackathon","Cybersecurity").forEach(titre->{
            Session session = new Session();
            session.setId(UUID.randomUUID().toString());
            session.setNom(titre);
            sessionRepository.save(session);
        });
        sessionRepository.findAll().forEach(ses->{
            for(int i=0;i<=5;i++){
                Conference conference = new Conference();
                conference.setId(UUID.randomUUID().toString());
                conference.setTitre(ses.getNom()+1);
                conference.setDate(Date.from(Instant.now()));
                conference.setSession(ses);
                conferenceRepository.save(conference);
            }
        });

        Inscription inscription = new Inscription();
        inscription.setId(UUID.randomUUID().toString());
        inscription.setDate(Date.from(Instant.now()));
        inscriptionRepository.save(inscription);


        Moderateur moderateur= new Moderateur();
        moderateur.setId(UUID.randomUUID().toString());
        moderateur.setSpecialite("Communication");
        moderateurRepository.save(moderateur);

        };
    }

}
