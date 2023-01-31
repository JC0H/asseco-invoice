package com.assecods.entity;

import com.assecods.annotation.KoliberDescription;
import com.assecods.annotation.KoliberFieldDescription;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@KoliberDescription(comment = "Opis")
@ToString
public class Invoice {

    @Id
    @GeneratedValue
    private Long id;

    @KoliberFieldDescription(comment = "Numer")
    private String number;

    @KoliberFieldDescription(comment = "Kwota")
    private BigDecimal amount;

    @JsonManagedReference
    @OneToOne(mappedBy="invoice", cascade = CascadeType.ALL)
    @KoliberDescription(comment = "Waluta")
    private Currency currency;

    @OneToOne(mappedBy = "invoice", cascade = CascadeType.ALL)
    @KoliberDescription(comment = "Kontrahent")
    private Contractor contractor;

    public void setCurrency(Currency currency) {
        currency.setInvoice(this);
        this.currency = currency;
    }

    public void setContractor(Contractor contractor) {
        contractor.setInvoice(this);
        this.contractor = contractor;
    }
}
