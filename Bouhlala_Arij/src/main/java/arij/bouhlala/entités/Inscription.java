package arij.bouhlala.entités;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity @AllArgsConstructor @NoArgsConstructor
@Data
public class Inscription {
    @Id
    private String id;
    private Date date;
    private Statut statut;
    @ManyToOne
    private Invité invité;
    @OneToOne
    private Session session;

}
