package cnstn.system_de_reservation_cnstn.controllers;

import cnstn.system_de_reservation_cnstn.models.Document;
import cnstn.system_de_reservation_cnstn.services.DocumentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Document")
public class DocumentController {

    private DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @PostMapping("/add")
    public Document CreateDocument(@RequestBody Document document) {
        return documentService.CreateDocument(document);
    }

    @GetMapping("/all")
    public List<Document> afficher() {
        return documentService.findAll();
    }
}
