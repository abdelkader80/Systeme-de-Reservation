package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.Equipement;
import cnstn.system_de_reservation_cnstn.repository.EquipementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipementService {
    private final EquipementRepository equipementRepository;

    public Equipement createEquipement(Equipement equipement) {
        if (equipementRepository.findById(equipement.getId()) != null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "equipement with id" + equipement.getId() + "' already exists");
        }
        return equipementRepository.save(equipement);

    }

    public List<Equipement> findAll() {
        return equipementRepository.findAll();
    }

    public void deleteService(Long id) {
        if(! equipementRepository.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND ,"equipement not found with id: " + id);
        }
        equipementRepository.deleteById(id);

    }
}
