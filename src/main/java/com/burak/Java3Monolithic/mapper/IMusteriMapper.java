package com.burak.Java3Monolithic.mapper;


import com.burak.Java3Monolithic.dto.response.MusteriFindByIdResponseDto;
import com.burak.Java3Monolithic.repository.entity.Musteri;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

/**
 * Mapper ın spring tarafında kullanılan yönetimi icin component Model olarak spring yazılmalı.
 * Sonuçta iki sınıfı karşılaştırarak deger ataması yapıyor. Bu nedenle karşılıklı sınıflarda olmayan alanlar sorun yaratacaklar. eşleşmeyen alanları es gecilir.
 */

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IMusteriMapper {

    /**
     * Mapstruct instance ını kendisi yaratır.
     */
    IMusteriMapper INSTANCE = Mappers.getMapper(IMusteriMapper.class);
    /**
     * Buradan itibaren ilgili nesnelerin değerleri birbirine atanır.
     *
     */

    MusteriFindByIdResponseDto toMusteriFindByIdResponseDto(Musteri musteri);


}
