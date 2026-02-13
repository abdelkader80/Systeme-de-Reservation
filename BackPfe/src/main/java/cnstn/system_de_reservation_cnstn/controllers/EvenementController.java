package cnstn.system_de_reservation_cnstn.controllers;

import cnstn.system_de_reservation_cnstn.models.Evenement;
import cnstn.system_de_reservation_cnstn.services.EvenementService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Evenement")
public class EvenementController {

    private EvenementService evenementService;
    public EvenementController(EvenementService evenementService)
    {
        this.evenementService=evenementService;
    }
    @PostMapping("/add")
    public Evenement create(@RequestBody Evenement evenement){
        return evenementService.Create(evenement);

    }
    @GetMapping("/all")
    public List<Evenement> Affiche(){

        return evenementService.findAll();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEvenement(@PathVariable Long id) {
        evenementService.deleteService(id);
        return ResponseEntity.noContent().build();
    }


}
