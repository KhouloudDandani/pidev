package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entities.Invoice;
@Repository
public interface IInvoiceRepository extends JpaRepository<Invoice, Long> {


}

