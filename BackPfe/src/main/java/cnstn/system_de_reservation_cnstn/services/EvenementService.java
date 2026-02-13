package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.Evenement;
import cnstn.system_de_reservation_cnstn.repository.EvenmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public  class EvenementService {
    private final EvenmentRepository evenmentRepository;
    public Evenement Create (Evenement evenement){
        if (evenmentRepository.findById(evenement.getId()) != null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "event with id '" + evenement.getId() + "' already exists");
        }
        return evenmentRepository.save(evenement);

    }
    public List<Evenement> findAll(){
        return evenmentRepository.findAll();
    }

    public void deleteService(Long id) {
       if(!evenmentRepository.existsById(id)){
           throw new ResponseStatusException(HttpStatus.NOT_FOUND ,"Evenement not found with id: " + id);
       }
        evenmentRepository.deleteById(id);
    }
}




