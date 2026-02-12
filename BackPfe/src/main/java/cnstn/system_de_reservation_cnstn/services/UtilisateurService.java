package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.Utilisateur;
import cnstn.system_de_reservation_cnstn.repository.UtilisateurRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UtilisateurService {
    private final UtilisateurRepository utilisateurRepository;

    public Utilisateur CreateUtilisateur(Utilisateur utilisateur) {

        return utilisateurRepository.save(utilisateur);
    }

    public List<Utilisateur> findAll() {

        return utilisateurRepository.findAll();
    }

    public Utilisateur update(Long id, Utilisateur updated) {
        Utilisateur existing = utilisateurRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Utilisateur not found: " + id));
        existing.setNom(updated.getNom());
        existing.setPrenom(updated.getPrenom());
        existing.setEmail(updated.getEmail());
        existing.setPoste(updated.getPoste());
        existing.setAdresse(updated.getAdresse());
        existing.setTelephone(updated.getTelephone());
        existing.setMatricule(updated.getMatricule());
        existing.setPassword(updated.getPassword());
        existing.setRole(updated.getRole());
        return utilisateurRepository.save(existing);
    }
}
