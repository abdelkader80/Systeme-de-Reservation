package cnstn.system_de_reservation_cnstn.repository;

import cnstn.system_de_reservation_cnstn.models.Evenement;
import cnstn.system_de_reservation_cnstn.models.Utilisateur;
import org.springframework.data.domain.Limit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EvenmentRepository extends JpaRepository<Evenement,Long>{
   Evenement findEvenementById(Long id);

   List<Evenement> findByTitreContainingIgnoreCaseOrTypeContainingIgnoreCase(String titre ,String type);


}
