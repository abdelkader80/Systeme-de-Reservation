package cnstn.system_de_reservation_cnstn.repository;

import cnstn.system_de_reservation_cnstn.models.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvenmentRepository extends JpaRepository<Evenement,Long>{
   Evenement findEvenementById(Long id);

}
