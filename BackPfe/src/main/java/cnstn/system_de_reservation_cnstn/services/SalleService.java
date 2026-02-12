package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.Salle;
import cnstn.system_de_reservation_cnstn.repository.SaleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SalleService {
    private final SaleRepository saleRepository;
    public Salle Create(Salle salle){
        return saleRepository.save(salle);

    }
    public List<Salle> findAll(){
        return saleRepository.findAll();
    }

}
