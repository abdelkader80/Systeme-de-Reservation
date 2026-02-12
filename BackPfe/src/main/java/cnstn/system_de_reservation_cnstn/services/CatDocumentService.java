package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.CatDocument;
import cnstn.system_de_reservation_cnstn.repository.CatDocumentRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CatDocumentService {

    private final CatDocumentRepository catDocumentRepository;

    public CatDocument CreateCatDocument(CatDocument catDocument) {
        return catDocumentRepository.save(catDocument);
    }

    public List<CatDocument> findAll() {
        return catDocumentRepository.findAll();
    }

    public CatDocument update(Long id, CatDocument updated) {
        CatDocument existing = catDocumentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("CatDocument not found: " + id));
        existing.setNom(updated.getNom());
        return catDocumentRepository.save(existing);
    }
}
