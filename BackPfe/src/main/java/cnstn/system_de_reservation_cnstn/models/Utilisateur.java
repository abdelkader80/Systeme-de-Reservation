package cnstn.system_de_reservation_cnstn.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String poste;
    private String adresse;
    private int telephone;
    private int matricule;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;
    @JsonIgnore
    @OneToMany(mappedBy = "utilisateur")
    private List<Intervention> intervention;
    @OneToMany(mappedBy = "utilisateur")
    private List<Equipement> equipement;
    @OneToMany(mappedBy = "utilisateur")
    private List<Reservation> reservation;
    @OneToMany(mappedBy = "utilisateur")
    private List<Evenement>  evenement;

}

