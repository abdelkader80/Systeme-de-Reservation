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
public class Reservation  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date DateDebut ;
    private Date DateFin ;
    private String type;
    @ManyToOne(fetch = FetchType.LAZY)
    private Utilisateur utilisateur;
    @ManyToOne(fetch = FetchType.LAZY)
    private Equipement  equipement ;
    @ManyToOne(fetch = FetchType.LAZY)
    private Salle salle;
}
