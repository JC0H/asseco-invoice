package com.assecods.service;

import com.assecods.dto.InvoiceDto;
import com.assecods.repository.InvoiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class InvoiceService {

    private final InvoiceRepository invoiceRepository;

    @Transactional(readOnly = true)
    public InvoiceDto getInvoiceBy(Long invoiceId) {
        return invoiceRepository.findAllDtoBy(invoiceId);
    }
}
