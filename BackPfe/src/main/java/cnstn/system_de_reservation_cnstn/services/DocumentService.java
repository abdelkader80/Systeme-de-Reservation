package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.Document;
import cnstn.system_de_reservation_cnstn.models.Utilisateur;
import cnstn.system_de_reservation_cnstn.repository.DocumentRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DocumentService {
    private final DocumentRepository documentRepository;
    public Document CreateDocument(Document document) {
        return documentRepository.save(document
        );
    }

    public List<Document> findAll() {
        return documentRepository.findAll();
    }

    public Document update(Long id, Document updated) {
        Document existing = documentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Document not found: " + id));
        existing.setTitre(updated.getTitre());
        existing.setType(updated.getType());
        existing.setChemin(updated.getChemin());
        existing.setNiveauAcces(updated.getNiveauAcces());
        existing.setEvenement(updated.getEvenement());
        existing.setCatDocument(updated.getCatDocument());
        return documentRepository.save(existing);
    }
}
