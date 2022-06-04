package arij.bouhlala.entités;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity @AllArgsConstructor @NoArgsConstructor
@Data
public class Session {
    @Id
    private String id;
    private String nom;
    @OneToMany(mappedBy = "session")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Conference> conferences = new ArrayList<>();
    @OneToOne
    private Moderateur moderateur;
    @OneToOne
    private Salle salle;
}
