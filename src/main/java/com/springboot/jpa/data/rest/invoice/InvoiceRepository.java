package com.springboot.jpa.data.rest.invoice;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "invoices", collectionResourceRel = "invoices")
public interface InvoiceRepository extends PagingAndSortingRepository<Invoice, Long> {

}

