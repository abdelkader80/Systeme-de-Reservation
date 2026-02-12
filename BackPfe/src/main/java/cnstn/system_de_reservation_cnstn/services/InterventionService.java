package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.Intervention;
import cnstn.system_de_reservation_cnstn.repository.InterventionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InterventionService {
    private final InterventionRepository interventionRepository;
    public Intervention create (Intervention intervention){
        return interventionRepository.save(intervention);
    }
    public List<Intervention> findAll(){
        return interventionRepository.findAll();
    }

    public Intervention update(Long id, Intervention updated) {
        Intervention existing = interventionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Intervention not found: " + id));
        existing.setDescription(updated.getDescription());
        existing.setStatut(updated.getStatut());
        existing.setDateDemande(updated.getDateDemande());
        existing.setUtilisateur(updated.getUtilisateur());
        existing.setEquipement(updated.getEquipement());
        return interventionRepository.save(existing);
    }
}
