package com.assecods.entity;

import com.assecods.annotation.KoliberDescription;
import com.assecods.annotation.KoliberFieldDescription;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@KoliberDescription(comment = "Kontrahent")
public class Contractor {

    @Id
    @GeneratedValue
    private Long id;

    @KoliberFieldDescription(comment = "Nazwa")
    private String name;

    @KoliberFieldDescription(comment = "NIP")
    private String nip;

    @JsonBackReference
    @OneToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;

    @JsonManagedReference
    @OneToMany(mappedBy = "contractor", cascade = CascadeType.ALL)
    @KoliberDescription(comment = "Adresy")
    private List<Address> addresses = new ArrayList<>();


}
