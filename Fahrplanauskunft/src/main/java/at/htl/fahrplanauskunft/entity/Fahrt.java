package at.htl.fahrplanauskunft.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@SequenceGenerator(name = "FahrtSeq", initialValue = 100, allocationSize = 1, sequenceName = "FAHRT_SEQ")
public class Fahrt {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FahrtSeq")
    @Column(name = "F_ID")
    private Long id;

    @ManyToOne
    Linie linie;
}
