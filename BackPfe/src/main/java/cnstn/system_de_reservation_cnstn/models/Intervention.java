package cnstn.system_de_reservation_cnstn.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Intervention {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String statut;
    private Date dateDemande;
    @ManyToOne(fetch = FetchType.LAZY)
    private Utilisateur utilisateur;
    @ManyToOne(fetch = FetchType.LAZY)
    private Equipement equipement;


}



