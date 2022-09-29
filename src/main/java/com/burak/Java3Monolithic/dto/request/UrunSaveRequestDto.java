package com.burak.Java3Monolithic.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UrunSaveRequestDto {

    String ad;
    String marka;
    String model;
    Double fiyat;
    Integer stok;


}
