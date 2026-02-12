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
}
