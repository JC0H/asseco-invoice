package com.assecods.repository;

import com.assecods.dto.InvoiceDto;
import com.assecods.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

    @Query("select new com.assecods.dto.InvoiceDto(" +
            "new com.assecods.dto.CurrencyDto(cur.code) ," +
            "i.amount, " +
            "new com.assecods.dto.ContractorDto(contr.name, " +
                                                "contr.nip, " +
                                                "new com.assecods.dto.AddressDto(addresses.city, " +
                                                                                "addresses.postalCode," +
                                                                                "addresses.street)), " +
            "i.number) " +
            "from Invoice i " +
            "inner join i.currency cur " +
            "inner join i.contractor contr " +
            "inner join i.contractor.addresses addresses " +
            "where i.id = ?1")
    InvoiceDto findAllDtoBy(Long invoiceId);
}
