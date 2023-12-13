package antoniogiovanni.marchese.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Partecipazione {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    @JoinColumn(name = "persona_id", nullable = false)
    private Persona persona;
    @ManyToOne
    @JoinColumn(name = "evento_id", nullable = false)
    private Evento evento;
    @Column(name = "stato")
    private StatoPartecipazione statoPartecipazione;

}
