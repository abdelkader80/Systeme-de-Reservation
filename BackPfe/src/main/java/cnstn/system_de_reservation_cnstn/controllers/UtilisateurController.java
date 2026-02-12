package cnstn.system_de_reservation_cnstn.controllers;

import cnstn.system_de_reservation_cnstn.models.Utilisateur;
import cnstn.system_de_reservation_cnstn.models.Utilisateur;
import cnstn.system_de_reservation_cnstn.services.UtilisateurService;
import cnstn.system_de_reservation_cnstn.services.UtilisateurService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Utilisateur")
public class UtilisateurController {
    private final UtilisateurService utilisateurService;

    public UtilisateurController(UtilisateurService employeService) {

        this.utilisateurService = employeService;
    }

    @PostMapping("/add")
    public Utilisateur CreateUtilisateur(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.CreateUtilisateur(utilisateur);
    }

    @GetMapping("/all")
    public List<Utilisateur> afficher() {
        return utilisateurService.findAll();
    }

}
