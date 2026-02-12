package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.Equipement;
import cnstn.system_de_reservation_cnstn.repository.EquipementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipementService {
    private final EquipementRepository equipementRepository;

    public Equipement createEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);

    }

    public List<Equipement> findAll() {
        return equipementRepository.findAll();
    }

    public Equipement update(Long id, Equipement updated) {
        Equipement existing = equipementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Equipement not found: " + id));
        existing.setTitre(updated.getTitre());
        existing.setType(updated.getType());
        existing.setDateDebut(updated.getDateDebut());
        existing.setUtilisateur(updated.getUtilisateur());
        return equipementRepository.save(existing);
    }
}
