package at.htl.fahrplanauskunft.boundary;

import at.htl.fahrplanauskunft.entity.Linie;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("/")
public class FahrplanEndpoint {
    @PersistenceContext
    EntityManager em;

    @PostConstruct
    public void init() {
        System.out.println("FahrplanEndpoint created ***");
    }

}
