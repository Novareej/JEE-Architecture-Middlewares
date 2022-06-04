package arij.bouhlala.entités;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity @NoArgsConstructor @AllArgsConstructor
public class Invité extends Participant{
    private String affiliation;
    @OneToMany(mappedBy = "invité")
    private List<Inscription> inscriptions = new ArrayList<>();
}
