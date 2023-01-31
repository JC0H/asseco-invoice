package com.assecods.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContractorDto {
    private String name;
    private String nip;
    private AddressDto address ;
}
