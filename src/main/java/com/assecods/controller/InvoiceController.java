package com.assecods.controller;

import com.assecods.dto.InvoiceDto;
import com.assecods.exception.InvoiceNotFoundException;
import com.assecods.service.InvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/invoices")
public class InvoiceController {

    private final InvoiceService invoiceService;

    @GetMapping("/{invoiceId}")
    public ResponseEntity<InvoiceDto> getInvoiceBy(@PathVariable Long invoiceId){
        InvoiceDto invoiceDto = Optional.ofNullable(invoiceService.getInvoiceBy(invoiceId))
                .orElseThrow( () -> new InvoiceNotFoundException(
                        "Can not find invoice by id " + invoiceId));

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(invoiceDto);
    }
}
