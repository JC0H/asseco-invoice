package com.assecods.entity;

import com.assecods.annotation.KoliberDescription;
import com.assecods.annotation.KoliberFieldDescription;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@KoliberDescription(comment = "Waluta")
public class Currency {

    @Id
    @GeneratedValue
    private Long id;

    @KoliberFieldDescription(comment = "Kod")
    private String code;

    @JsonBackReference
    @OneToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;

}
