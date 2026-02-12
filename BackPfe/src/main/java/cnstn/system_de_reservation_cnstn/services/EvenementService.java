package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.Evenement;
import cnstn.system_de_reservation_cnstn.repository.EvenmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public  class EvenementService {
    private final EvenmentRepository evenmentRepository;
    public Evenement Create (Evenement evenement){
        return evenmentRepository.save(evenement);

    }
    public List<Evenement> findAll(){
        return evenmentRepository.findAll();
    }

    public Evenement update(Long id, Evenement updated) {
        Evenement existing = evenmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Evenement not found: " + id));
        existing.setTitre(updated.getTitre());
        existing.setDescription(updated.getDescription());
        existing.setDateDebut(updated.getDateDebut());
        existing.setDateFin(updated.getDateFin());
        existing.setUtilisateur(updated.getUtilisateur());
        return evenmentRepository.save(existing);
    }
}




