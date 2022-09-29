package com.burak.Java3Monolithic.service;

import com.burak.Java3Monolithic.dto.request.UrunSaveRequestDto;
import com.burak.Java3Monolithic.dto.response.UrunGetFindByIdResponseDto;
import com.burak.Java3Monolithic.mapper.IUrunMapper;
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

      return IUrunMapper.INSTANCE.toUrunGetByIdResponseDto(urun);
//     return UrunGetFindByIdResponseDto.builder().ad(urun.getAd()).marka(urun.getMarka()).model(urun.getModel()).build();

   }

   public Urun save(UrunSaveRequestDto dto){

      /**
       * Urun mapper ile dışarıdan gelen ürün bilgilerini içeren DTO yu Urun Entity sine dönüştürüyoruz.
       *
       * Kayıt edilen ürün nesnesine kayıt sonrsı ID bilgisi işlenir.
       *
       */
      Urun urun = IUrunMapper.INSTANCE.toUrun(dto);
      urun.setCreateDate(System.currentTimeMillis());
      urun.setActive(true);
      iUrunRepository.save(urun);
      return urun;
   }
}
