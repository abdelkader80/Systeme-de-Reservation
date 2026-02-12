package cnstn.system_de_reservation_cnstn.controllers;

import cnstn.system_de_reservation_cnstn.models.Intervention;
import cnstn.system_de_reservation_cnstn.services.InterventionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Intervention")
public class InterventionController {

    private InterventionService interventionService;

    public InterventionController(InterventionService interventionService) {
        this.interventionService = interventionService;
    }

    @PostMapping("/add")
    public Intervention create(@RequestBody Intervention intervention) {
        return interventionService.create(intervention);
    }

    @GetMapping("/all")
    public List<Intervention> Affiche() {
        return interventionService.findAll();
    }
}
