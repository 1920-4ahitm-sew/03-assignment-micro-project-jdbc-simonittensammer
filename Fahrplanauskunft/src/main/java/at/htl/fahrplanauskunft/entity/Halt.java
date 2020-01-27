package at.htl.fahrplanauskunft.entity;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "HaltSeq", initialValue = 100, allocationSize = 1, sequenceName = "HALT_SEQ")
public class Halt {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HaltSeq")
    @Column(name = "H_ID")
    Long id;

    @ManyToOne
    Haltestelle haltestelle;

    @ManyToOne
    Fahrt fahrt;
}
