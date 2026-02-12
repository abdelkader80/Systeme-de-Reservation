package cnstn.system_de_reservation_cnstn.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.AssertTrue;
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
public class Reservation  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(nullable = false)
    private Date DateDebut ;
    @NotNull
    @Column(nullable = false)
    private Date DateFin ;
    @NotBlank
    @Size(max = 255)
    @Column(nullable = false)
    private String type;
    @ManyToOne(fetch = FetchType.LAZY)
    private Utilisateur utilisateur;
    @ManyToOne(fetch = FetchType.LAZY)
    private Equipement  equipement ;
    @ManyToOne(fetch = FetchType.LAZY)
    private Salle salle;

    @AssertTrue(message = "DateFin must be after or equal to DateDebut")
    private boolean isDateRangeValid() {
        if (DateDebut == null || DateFin == null) {
            return true;
        }
        return !DateFin.before(DateDebut);
    }
}
