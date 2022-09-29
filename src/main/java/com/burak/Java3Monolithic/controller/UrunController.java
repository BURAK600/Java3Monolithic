package com.burak.Java3Monolithic.controller;

import com.burak.Java3Monolithic.dto.request.UrunSaveRequestDto;
import com.burak.Java3Monolithic.dto.response.UrunGetFindByIdResponseDto;
import com.burak.Java3Monolithic.repository.entity.Urun;
import com.burak.Java3Monolithic.service.UrunService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.burak.Java3Monolithic.constants.EndPoints.*;

@RestController
@RequestMapping(VERSION+API+URUN)
@RequiredArgsConstructor
public class UrunController {

    private final UrunService urunService;

    @GetMapping(SAVE)
    public String save(String ad, String marka, String model, Double fiyat, Integer stok){

        Urun urun =Urun.builder().ad(ad).marka(marka).model(model).fiyat(fiyat).stok(stok)
                .build();
        urunService.save(urun);
        return "Ürün kaydedildi";

    }

    @GetMapping(URUNSAVEDTO)
    public String save(UrunSaveRequestDto dto){
        urunService.save(dto);
        return "Urundto kaydedildi.";

    }

    @GetMapping(FINDBYID)
    public Urun findById(Long id){
        return urunService.findById(id);
    }
    @GetMapping(FINDBYIDDTO)
    public UrunGetFindByIdResponseDto getFindId(Long id){

        return urunService.findByIdDto(id);
    }


    @GetMapping(GETALL)
    public List<Urun> findAll(){
      return  urunService.findAll();

    }

}
