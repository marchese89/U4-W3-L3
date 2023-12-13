package antoniogiovanni.marchese;

import antoniogiovanni.marchese.dao.EventoDAO;
import antoniogiovanni.marchese.entities.Evento;
import antoniogiovanni.marchese.entities.TipoEvento;
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
        EventoDAO sd = new EventoDAO(em);
        //Inserimento dati
        //sd.save(new Evento("Evento1", LocalDate.now(),"descrizione", TipoEvento.PUBBLICO,4));
        //sd.save(new Evento("Evento2", LocalDate.now(),"descrizione2", TipoEvento.PUBBLICO,40));
        //sd.save(new Evento("Evento3", LocalDate.now(),"descrizione3", TipoEvento.PUBBLICO,14));

        //get

        Evento e = sd.findById(3);
        System.out.println(e);

        //delete

        //sd.findByIdAndDelete(2);
    }
}
