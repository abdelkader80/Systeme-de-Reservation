package cnstn.system_de_reservation_cnstn.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Salle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Min(1)
    @Column(nullable = false)
    private int capacite;
    @NotBlank
    @Size(max = 255)
    @Column(nullable = false, length = 255)
    private String nom;
    @Size(max = 255)
    @Column(length = 255)
    private String description;
    @OneToMany(mappedBy = "salle")
    @JsonIgnore
    private List<Reservation> reservation;


}
