package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.Salle;
import cnstn.system_de_reservation_cnstn.repository.SaleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SalleService {
    private final SaleRepository saleRepository;
    public Salle Create(Salle salle){
        if (saleRepository.findByNom(salle.getNom()) != null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Salle with nom '" + salle.getNom() + "' already exists");
        }
        return saleRepository.save(salle);
    }
    public List<Salle> findAll(){
        return saleRepository.findAll();
    }

    public void deleteSalle(Long id) {
        if (!saleRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Salle not found with id " + id);
        }
        saleRepository.deleteById(id);
    }
}

