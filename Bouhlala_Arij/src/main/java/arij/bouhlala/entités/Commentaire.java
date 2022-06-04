package arij.bouhlala.entités;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity @AllArgsConstructor @NoArgsConstructor
@Data
public class Commentaire {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    private String contenu;
    private int nb_likes;
    @ManyToOne
    private Conference conference;
    @ManyToOne
    private Participant participant;
}
