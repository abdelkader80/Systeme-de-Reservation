package cnstn.system_de_reservation_cnstn.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
    @NotBlank
    @Size(max = 255)
    @Column(nullable = false, length = 255)
    private String nom;
    @NotBlank
    @Size(max = 255)
    @Column(nullable = false, length = 255)
    private String prenom;
    @Email
    @NotBlank
    @Size(max = 255)
    @Column(nullable = false, unique = true, length = 255)
    private String email;
    @NotBlank
    @Size(max = 255)
    @Column(nullable = false, length = 255)
    private String poste;
    @NotBlank
    @Size(max = 255)
    @Column(nullable = false, length = 255)
    private String adresse;
    @Min(1)
    @Column(nullable = false)
    private int telephone;
    @Min(1)
    @Column(nullable = false)
    private int matricule;
    @NotBlank
    @Size(min = 6, max = 255)
    @Column(nullable = false, length = 255)
    private String password;
    @NotNull
    @Column(nullable = false, length = 255)
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

