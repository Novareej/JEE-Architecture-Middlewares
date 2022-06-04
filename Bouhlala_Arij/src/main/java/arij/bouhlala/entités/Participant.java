package arij.bouhlala.entités;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NoArgsConstructor @AllArgsConstructor
@Data
public class Participant {
    @Id
    private String id;
    private String nom;
    private String email;
    private String photo;
    private char genre;
}
