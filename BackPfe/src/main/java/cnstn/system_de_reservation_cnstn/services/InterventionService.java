package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.Intervention;
import cnstn.system_de_reservation_cnstn.repository.InterventionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

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

    public void deleteIntervention(Long id) {
        if (!interventionRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Intervention not found with id " + id);
        }
        interventionRepository.deleteById(id);
    }
}
