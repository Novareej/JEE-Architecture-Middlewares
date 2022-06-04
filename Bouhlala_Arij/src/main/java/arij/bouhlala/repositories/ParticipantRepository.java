package arij.bouhlala.repositories;

import arij.bouhlala.entités.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant,String> {
}
