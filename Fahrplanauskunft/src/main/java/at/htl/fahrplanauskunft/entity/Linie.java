package at.htl.fahrplanauskunft.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

@Entity
public class Linie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String abfahrtsOrt;
    String ankunftsOrt;
    Transportmittel transportmittel;
    List<Haltestelle> haltestellen;

    public Linie(String abfahrtsOrt, String ankunftsOrt, Transportmittel transportmittel, List<Haltestelle> haltestellen) {
        this.abfahrtsOrt = abfahrtsOrt;
        this.ankunftsOrt = ankunftsOrt;
        this.transportmittel = transportmittel;
        this.haltestellen = haltestellen;
    }

    public Linie() {

    }
}
