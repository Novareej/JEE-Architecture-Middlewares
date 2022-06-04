package arij.bouhlala.dtos;

import arij.bouhlala.entités.Commentaire;
import arij.bouhlala.entités.Session;
import arij.bouhlala.entités.Speaker;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@AllArgsConstructor @NoArgsConstructor
@Data
public class ConferenceDTO {

    private String id;
    private String titre;
    private Date date;
    private int heure_deb;
    private int heure_fin;
    private String des;
    private Session session;
    }
