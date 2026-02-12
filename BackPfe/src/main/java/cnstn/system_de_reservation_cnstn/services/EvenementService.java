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
}




