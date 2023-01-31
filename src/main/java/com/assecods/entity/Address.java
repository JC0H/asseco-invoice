package com.assecods.entity;

import com.assecods.annotation.KoliberDescription;
import com.assecods.annotation.KoliberFieldDescription;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@KoliberDescription(comment = "Adres")
public class Address {

    @Id
    @GeneratedValue
    private Long id;

    @KoliberFieldDescription(comment = "Miasto")
    private String city;

    @KoliberFieldDescription(comment = "Kod pocztowy")
    private String postalCode;

    @KoliberFieldDescription(comment = "Ulica")
    private String street;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "contractor_id")
    private Contractor contractor;

}
