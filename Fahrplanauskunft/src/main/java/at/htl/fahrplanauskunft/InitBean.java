package at.htl.fahrplanauskunft;

import at.htl.fahrplanauskunft.entity.Linie;
import at.htl.fahrplanauskunft.entity.Transportmittel;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
public class InitBean {

    @PersistenceContext
    EntityManager em;

    public void init(@Observes @Initialized(ApplicationScoped.class) Object init) {
        System.out.println("*** It works! ***");

        em.persist(new Linie("Tragwein", "Linz Hauptbahnhof", Transportmittel.BUS));
        em.persist(new Linie("Linz Hauptbahnhof", "Meixnerkreuzung", Transportmittel.STRASSENBAHN));
    }
}
