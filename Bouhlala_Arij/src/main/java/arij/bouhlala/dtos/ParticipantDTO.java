package arij.bouhlala.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Data
@NoArgsConstructor @AllArgsConstructor
public class ParticipantDTO {

    private String id;
    private String nom;
    private String email;
    private String photo;
    private char genre;
}
