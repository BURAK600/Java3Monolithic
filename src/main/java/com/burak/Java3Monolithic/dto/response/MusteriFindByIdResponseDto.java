package com.burak.Java3Monolithic.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MusteriFindByIdResponseDto {
    String ad;
    String soyad;
    String adres;

}
