package arij.bouhlala.dtos;

import arij.bouhlala.entités.Conference;
import arij.bouhlala.entités.Participant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor @NoArgsConstructor
@Data
public class CommentaireDTO {
     private long id;
    private Date date;
    private String contenu;
    private int nb_likes;

}
