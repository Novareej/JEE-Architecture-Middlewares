package ma.enset.jpaassoc.Service;

import ma.enset.jpaassoc.entities.Consultation;
import ma.enset.jpaassoc.entities.Medecin;
import ma.enset.jpaassoc.entities.Patient;
import ma.enset.jpaassoc.entities.RendezVous;
import ma.enset.jpaassoc.repositories.ConsultationRepository;
import ma.enset.jpaassoc.repositories.MedecinRepository;
import ma.enset.jpaassoc.repositories.PatientRepository;
import ma.enset.jpaassoc.repositories.RendezVousRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class HospitalServiceImpl implements HospitalService {

    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;

    public HospitalServiceImpl(PatientRepository patientRepository, MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRDV(RendezVous rdv) {
        rdv.setId((UUID.randomUUID().toString()));
        return rendezVousRepository.save(rdv);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
