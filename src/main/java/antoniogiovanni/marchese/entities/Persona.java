package antoniogiovanni.marchese.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "persone")
public class Persona {

    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private String cognome;
    private String email;
    @Column(name = "data_di_nascita")
    private LocalDate dataDiNascita;
    @Enumerated(EnumType.STRING)
    Sesso sesso;
    @OneToMany(mappedBy = "persona")
    private List<Partecipazione> listaPartecipazioni;
}
