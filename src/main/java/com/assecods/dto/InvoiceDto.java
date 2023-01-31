package com.assecods.dto;

import com.assecods.annotation.KoliberFieldDescription;
import com.assecods.entity.Address;
import com.assecods.entity.Contractor;
import com.assecods.entity.Currency;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceDto {
    private CurrencyDto currency;
    private BigDecimal amount;
    private ContractorDto contractor;
    private String number;
}


