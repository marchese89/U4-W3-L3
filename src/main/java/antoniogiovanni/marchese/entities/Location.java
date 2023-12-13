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

    public Location(String nome, String citta, Evento evento) {
        this.nome = nome;
        this.citta = citta;
        this.evento = evento;
    }

    public Location() {
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", citta='" + citta + '\'' +
//                ", evento=" + evento +
                '}';
    }
}
