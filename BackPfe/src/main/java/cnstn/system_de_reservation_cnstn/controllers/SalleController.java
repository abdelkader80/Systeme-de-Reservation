package cnstn.system_de_reservation_cnstn.controllers;

import cnstn.system_de_reservation_cnstn.models.Salle;
import cnstn.system_de_reservation_cnstn.services.SalleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Salle")
public class SalleController {
    private  SalleService salleService;
    public void SalleService (SalleService salleService){
        this.salleService=salleService;

    }
    @PostMapping("/add")
    public Salle Create(@RequestBody Salle salle){
        return salleService.Create(salle);

    }
    @GetMapping("/all")
    public List<Salle> affiche(){
        return salleService.findAll();
    }


}
