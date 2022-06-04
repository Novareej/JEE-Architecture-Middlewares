package arij.bouhlala.dtos;

import arij.bouhlala.entités.Conference;
import arij.bouhlala.entités.Moderateur;
import arij.bouhlala.entités.Salle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor @NoArgsConstructor
@Data
public class SessionDTO {
    private String id;
    private String nom;

}
