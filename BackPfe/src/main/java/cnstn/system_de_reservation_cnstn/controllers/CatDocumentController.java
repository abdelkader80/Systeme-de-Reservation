package cnstn.system_de_reservation_cnstn.controllers;

import cnstn.system_de_reservation_cnstn.models.CatDocument;
import cnstn.system_de_reservation_cnstn.services.CatDocumentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/CatDocument")
public class CatDocumentController {

    private CatDocumentService catDocumentService;

    public CatDocumentController(CatDocumentService catDocumentService) {
        this.catDocumentService = catDocumentService;
    }

    @PostMapping("/add")
    public CatDocument CreateCatDocument(@RequestBody CatDocument catDocument) {
        return catDocumentService.CreateCatDocument(catDocument);
    }

    @GetMapping("/all")
    public List<CatDocument> afficher() {
        return catDocumentService.findAll();
    }

    @PutMapping("/update/{id}")
    public CatDocument update(@PathVariable Long id, @RequestBody CatDocument catDocument) {
        return catDocumentService.update(id, catDocument);
    }


}
