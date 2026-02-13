package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.Utilisateur;
import cnstn.system_de_reservation_cnstn.repository.UtilisateurRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UtilisateurService {
    private final UtilisateurRepository utilisateurRepository;

    public Utilisateur CreateUtilisateur(Utilisateur utilisateur) {
        if (utilisateur.getId() != null && utilisateurRepository.findById(utilisateur.getId()).isPresent()) {

            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "user with id '" + utilisateur.getId() + "' already exists");
        }

        return utilisateurRepository.save(utilisateur);
    }

    public List<Utilisateur> findAll() {

        return utilisateurRepository.findAll();
    }

    public void deleteService(Long id) {
        if(! utilisateurRepository.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND ,"user not found with id: " + id);
        }
        utilisateurRepository.deleteById(id);
    }
}
