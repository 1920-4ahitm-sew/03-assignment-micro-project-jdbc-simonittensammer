package at.htl.fahrplanauskunft.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@SequenceGenerator(name = "LinieSeq", initialValue = 100, allocationSize = 1, sequenceName = "LINIE_SEQ")
public class Linie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LinieSeq")
    @Column(name = "L_ID")
    private Long id;
    String abfahrtsOrt;
    String ankunftsOrt;
    Transportmittel transportmittel;

    //region Constructors
    public Linie(String abfahrtsOrt, String ankunftsOrt, Transportmittel transportmittel) {
        this.abfahrtsOrt = abfahrtsOrt;
        this.ankunftsOrt = ankunftsOrt;
        this.transportmittel = transportmittel;
    }

    public Linie() {

    }
    //endregion

    //region Getter and Setter
    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getAbfahrtsOrt() {
        return abfahrtsOrt;
    }

    public void setAbfahrtsOrt(String abfahrtsOrt) {
        this.abfahrtsOrt = abfahrtsOrt;
    }

    public String getAnkunftsOrt() {
        return ankunftsOrt;
    }

    public void setAnkunftsOrt(String ankunftsOrt) {
        this.ankunftsOrt = ankunftsOrt;
    }

    public Transportmittel getTransportmittel() {
        return transportmittel;
    }

    public void setTransportmittel(Transportmittel transportmittel) {
        this.transportmittel = transportmittel;
    }
    //endregion

    @Override
    public String toString() {
        return "Linie{" +
                "id=" + id +
                ", abfahrtsOrt='" + abfahrtsOrt + '\'' +
                ", ankunftsOrt='" + ankunftsOrt + '\'' +
                ", transportmittel=" + transportmittel +
                '}';
    }
}
