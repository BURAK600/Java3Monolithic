package com.burak.Java3Monolithic.controller;


import com.burak.Java3Monolithic.repository.entity.Musteri;
import com.burak.Java3Monolithic.service.MusteriService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.burak.Java3Monolithic.constants.EndPoints.*;

@RestController
@RequestMapping(VERSION+API+MUSTERI)
@RequiredArgsConstructor
public class MusteriController {
    private final MusteriService musteriService;


    @GetMapping(SAVE)
    public String saveMusteri(String ad, String soyad, String adres){
        Musteri musteri = Musteri.builder().ad(ad).soyad(soyad).adres(adres)

                .build();
        musteriService.save(musteri);
        return "Musteri kaydedildi.";


    }
    @GetMapping(GETALL)
    public ResponseEntity<List<Musteri>> findAll(){
        return ResponseEntity.ok(musteriService.findAll());
    }



    @GetMapping("/findByAdres")
    public ResponseEntity<List<Musteri>> findByAdres(String adres){
        return ResponseEntity.ok(musteriService.findByAdres(adres));
    }


}
