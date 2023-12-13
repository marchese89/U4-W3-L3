package antoniogiovanni.marchese.entities;

import javax.persistence.*;

@Entity
public class Location {
    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private String citta;

    @OneToOne
    @JoinColumn(name = "evento_id", nullable = false, unique = true)
    private Evento evento;
}
