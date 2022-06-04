package arij.bouhlala.entités;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity @NoArgsConstructor @AllArgsConstructor
@Data
public class Speaker extends Participant{
    private String lien_profil;
    @OneToOne
    private Conference conference;

}
