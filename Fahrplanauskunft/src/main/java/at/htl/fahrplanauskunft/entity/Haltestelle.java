package at.htl.fahrplanauskunft.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@SequenceGenerator(name = "HaltestelleSeq", initialValue = 100, allocationSize = 1, sequenceName = "HALTESTELLE_SEQ")
public class Haltestelle {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HaltestelleSeq")
    @Column(name = "HS_ID")
    Long id;
    String name;

    @ManyToMany
    List<Linie> linien;

    public Haltestelle(String name) {
        this.name = name;
    }

    public Haltestelle() {
    }

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
