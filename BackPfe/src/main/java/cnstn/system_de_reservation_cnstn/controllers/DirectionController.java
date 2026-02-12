package cnstn.system_de_reservation_cnstn.controllers;

import cnstn.system_de_reservation_cnstn.models.Direction;
import cnstn.system_de_reservation_cnstn.models.Utilisateur;
import cnstn.system_de_reservation_cnstn.services.DirectionService;
import cnstn.system_de_reservation_cnstn.services.UtilisateurService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Direction")
public class DirectionController {
    private final DirectionService directionService;

    public DirectionController(DirectionService directionService) {
        this.directionService = directionService;
    }

    @PostMapping("/add")
    public Direction createDirection(@RequestBody Direction direction) {
        return directionService.createDirection(direction);
    }
    @PostMapping("/all")
    public List<Direction> afficher(){
        return directionService.findAll();
    }


}