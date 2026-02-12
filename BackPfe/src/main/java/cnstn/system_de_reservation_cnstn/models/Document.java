package cnstn.system_de_reservation_cnstn.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
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

    @NotBlank
    @Size(max = 255)
    @Column(nullable = false, length = 255)
    private String titre;
    @NotBlank
    @Size(max = 255)
    @Column(nullable = false, length = 255)
    private String type;
    @NotBlank
    @Size(max = 255)
    @Column(nullable = false, length = 255)
    private String chemin;
    @NotBlank
    @Size(max = 255)
    @Column(nullable = false, length = 255)
    private String niveauAcces;
    @ManyToOne(fetch =  FetchType.LAZY)
    private Evenement evenement;
    @ManyToOne(fetch = FetchType.LAZY)
    private CatDocument catDocument;

}

