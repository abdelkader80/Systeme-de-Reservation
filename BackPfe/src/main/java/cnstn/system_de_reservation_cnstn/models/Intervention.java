package cnstn.system_de_reservation_cnstn.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
    @NotBlank
    @Size(max = 255)
    @Column(nullable = false, length = 255)
    private String description;
    @NotBlank
    @Size(max = 255)
    @Column(nullable = false, length = 255)
    private String statut;
    @NotNull
    @Column(nullable = false)
    private Date dateDemande;
    @ManyToOne(fetch = FetchType.LAZY)
    private Utilisateur utilisateur;
    @ManyToOne(fetch = FetchType.LAZY)
    private Equipement equipement;


}



