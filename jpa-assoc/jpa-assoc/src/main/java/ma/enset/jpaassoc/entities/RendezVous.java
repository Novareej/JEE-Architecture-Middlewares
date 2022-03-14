package ma.enset.jpaassoc.entities;

import java.util.Date;

public class RendezVous {
    private Long id;
    private Date date;
    private StatusRdv status;
    private Patient patient;
    private Medecin medecin;
}
