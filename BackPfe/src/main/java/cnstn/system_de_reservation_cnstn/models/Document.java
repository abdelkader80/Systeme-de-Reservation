package cnstn.system_de_reservation_cnstn.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String type;
    private String chemin;
    private String niveauAcces;
    @ManyToOne(fetch =  FetchType.LAZY)
    private Evenement evenement;
    @ManyToOne(fetch = FetchType.LAZY)
    private CatDocument catDocument;

}

