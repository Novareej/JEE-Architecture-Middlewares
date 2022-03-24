package ma.enset.jpaassoc;

import ma.enset.jpaassoc.Service.HospitalService;
import ma.enset.jpaassoc.entities.*;
import ma.enset.jpaassoc.repositories.ConsultationRepository;
import ma.enset.jpaassoc.repositories.MedecinRepository;
import ma.enset.jpaassoc.repositories.PatientRepository;
import ma.enset.jpaassoc.repositories.RendezVousRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class JpaAssocApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaAssocApplication.class, args);
	}
	@Bean
	CommandLineRunner start(HospitalService hospitalService, PatientRepository patientRepository,RendezVousRepository rendezVousRepository,MedecinRepository medecinRepository,ConsultationRepository consultationRepository){
		return args -> {
			Stream.of("Arij","ikram","Sanae")
					.forEach(name->{
						Patient patient=new Patient();
						patient.setNom(name);
						patient.setDateNaissance(new Date());
						patient.setMalade(false);
						hospitalService.savePatient(patient);

					});
			Stream.of("Medo","Mouad","Adnane")
					.forEach(name->{
						Medecin medecin=new Medecin();
						medecin.setNom(name);
						medecin.setEmail(name+"@gmail.com");
						medecin.setSpecialite(Math.random()>0.5?"Cardio":"Psychiatrie");
						hospitalService.saveMedecin(medecin);

					});

			Patient patient=patientRepository.findById(1L).orElse(null);
			Patient patient1=patientRepository.findByNom("Arij");

			Medecin medecin=medecinRepository.findByNom("Adnane");

			RendezVous rendezVous=new RendezVous();
			rendezVous.setDate(new Date());
			rendezVous.setStatus(StatusRdv.PENDING);
			rendezVous.setMedecin(medecin);
			rendezVous.setPatient(patient);
			rendezVousRepository.save(rendezVous);

			RendezVous rendezVous1=rendezVousRepository.findById(1L).orElse(null);
			Consultation consultation=new Consultation();
			consultation.setDateConsultation(new Date());
			consultation.setRendezVous(rendezVous1);
			consultation.setRapport("Rapport..");
			consultationRepository.save(consultation);

		};
	}
}
