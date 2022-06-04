package arij.bouhlala.repositories;

import arij.bouhlala.entités.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentaireRepository extends JpaRepository<Commentaire,Long> {
}
