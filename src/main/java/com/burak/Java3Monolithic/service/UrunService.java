package com.burak.Java3Monolithic.service;

import com.burak.Java3Monolithic.dto.response.UrunGetFindByIdResponseDto;
import com.burak.Java3Monolithic.repository.IUrunRepository;
import com.burak.Java3Monolithic.repository.entity.Urun;
import com.burak.Java3Monolithic.utility.ServiceManager;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UrunService extends ServiceManager<Urun, Long> {

   private final IUrunRepository iUrunRepository;


   public UrunService(IUrunRepository iUrunRepository) {
      super(iUrunRepository);
      this.iUrunRepository = iUrunRepository;
   }

   public UrunGetFindByIdResponseDto findByIdDto(Long id){
      Urun urun = iUrunRepository.getReferenceById(id);

     return UrunGetFindByIdResponseDto.builder().ad(urun.getAd()).marka(urun.getMarka()).model(urun.getModel()).build();

   }
}
