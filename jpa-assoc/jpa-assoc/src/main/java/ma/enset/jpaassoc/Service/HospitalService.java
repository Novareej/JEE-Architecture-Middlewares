package ma.enset.jpaassoc.Service;

import ma.enset.jpaassoc.entities.Consultation;
import ma.enset.jpaassoc.entities.Medecin;
import ma.enset.jpaassoc.entities.Patient;
import ma.enset.jpaassoc.entities.RendezVous;

public interface HospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rdv);
    Consultation saveConsultation(Consultation consultation);
}
