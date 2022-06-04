package arij.bouhlala.dtos;

import arij.bouhlala.entités.Invité;
import arij.bouhlala.entités.Session;
import arij.bouhlala.entités.Statut;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
 @AllArgsConstructor @NoArgsConstructor
@Data
public class InscriptionDTO {
   private long id;
    private Date date;
    private Statut statut;


}
