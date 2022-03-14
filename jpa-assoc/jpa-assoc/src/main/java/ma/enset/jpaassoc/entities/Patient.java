package ma.enset.jpaassoc.entities;

import java.util.Collection;
import java.util.Date;

public class Patient {
    private  Long id;
    private String nom;
    private Date dateNaissance;
    private boolean malade;
    private Collection<RendezVous> rendezVous;
}
