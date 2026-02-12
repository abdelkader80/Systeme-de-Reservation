package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.CatDocument;
import cnstn.system_de_reservation_cnstn.repository.CatDocumentRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

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

    public void deleteCatDocument(Long id) {
        if (!catDocumentRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "CatDocument not found with id " + id);
        }
        catDocumentRepository.deleteById(id);
    }
}
