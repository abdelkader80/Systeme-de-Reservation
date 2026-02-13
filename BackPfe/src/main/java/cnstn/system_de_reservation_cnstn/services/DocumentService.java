package cnstn.system_de_reservation_cnstn.services;

import cnstn.system_de_reservation_cnstn.models.Document;
import cnstn.system_de_reservation_cnstn.models.Utilisateur;
import cnstn.system_de_reservation_cnstn.repository.DocumentRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DocumentService {
    private final DocumentRepository documentRepository;
    public Document CreateDocument(Document document) {
        if (documentRepository.findById(document.getId()) != null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "document with id '" + document.getId() + "' already exists");
        }
        return documentRepository.save(document);
    }

    public List<Document> findAll() {
        return documentRepository.findAll();
    }

    public void deleteService(Long id){
        if(!documentRepository.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND ,"Document not found with id: " + id);
        }
        documentRepository.deleteById(id);
    }
}
