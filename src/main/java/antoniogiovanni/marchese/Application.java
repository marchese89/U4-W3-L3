package antoniogiovanni.marchese;

import antoniogiovanni.marchese.dao.EventoDAO;
import antoniogiovanni.marchese.dao.LocationDAO;
import antoniogiovanni.marchese.dao.PartecipazioneDAO;
import antoniogiovanni.marchese.dao.PersonaDAO;
import antoniogiovanni.marchese.entities.*;
import org.hibernate.type.DateType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Date;
import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4-w3-l2");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager(); // Entity Manager è responsabile della gestione delle interazioni col DB
        EventoDAO ed = new EventoDAO(em);
        PersonaDAO pd = new PersonaDAO(em);
        LocationDAO ld = new LocationDAO(em);
        PartecipazioneDAO ppd = new PartecipazioneDAO(em);
        //salvo la persona
        Persona persona = new Persona("NomePersona","CognomePersona","email@email.it",LocalDate.now(), Sesso.M);
        //pd.save(persona);
        //creo un evento
        Evento evento = new Evento("TitoloEvento",LocalDate.now().plusWeeks(3),"descrizione evento",TipoEvento.PUBBLICO,50);

        //aggiungo la location

        Location location = new Location("Location 1","Parigi");
        evento.setLocation(location);
        //ld.save(location);
        //ed.save(evento);

        //trovo la persona con id 2
        //Persona personaFromDB = pd.findById(7);
        //Evento eventoFromDB = ed.findById(9);
        //Partecipazione partecipazione = new Partecipazione(personaFromDB,eventoFromDB,StatoPartecipazione.DA_CONFERMARE);
        //ppd.save(partecipazione);

        //ed.findByIdAndDelete(9);
    }
}
