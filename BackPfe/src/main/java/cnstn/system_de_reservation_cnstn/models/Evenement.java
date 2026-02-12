package cnstn.system_de_reservation_cnstn.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;


import jakarta.persistence.*;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.hibernate.sql.results.graph.Fetch;

import java.util.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Evenement {

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
    private String description;
    @NotNull
    @Column(nullable = false)
    private Date dateDebut;
    @NotNull
    @Column(nullable = false)
    private Date dateFin;
    @ManyToOne(fetch = FetchType.LAZY)
    private Utilisateur utilisateur;
    @OneToMany(mappedBy = "evenement")
    private List<Document> document;

    @AssertTrue(message = "dateFin must be after or equal to dateDebut")
    private boolean isDateRangeValid() {
        if (dateDebut == null || dateFin == null) {
            return true;
        }
        return !dateFin.before(dateDebut);
    }






}
