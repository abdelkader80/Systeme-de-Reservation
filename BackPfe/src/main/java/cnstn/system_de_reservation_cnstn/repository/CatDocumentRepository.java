package cnstn.system_de_reservation_cnstn.repository;

import cnstn.system_de_reservation_cnstn.models.CatDocument;
import cnstn.system_de_reservation_cnstn.models.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatDocumentRepository extends JpaRepository<CatDocument, Long> {
    CatDocument findCatDocumentById(Long id);
}
