package arij.bouhlala.entités;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Data
public class Conference {
    @Id
    private String id;
    private String titre;
    private Date date;
    private int heure_deb;
    private int heure_fin;
    private String des;
    @ManyToOne
    private Session session;
    @OneToOne
    private Speaker speaker;
    @OneToMany(mappedBy = "conference")
    private List<Commentaire> commentaires = new ArrayList<>();
}
