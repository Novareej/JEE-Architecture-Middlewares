package arij.bouhlala.entités;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Data
public class Moderateur extends Participant{
    private String specialite;
    @OneToOne
    private Session session;
}
