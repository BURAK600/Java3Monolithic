package com.burak.Java3Monolithic.controller;

import com.burak.Java3Monolithic.repository.entity.Satis;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.burak.Java3Monolithic.constants.EndPoints.*;

/**
 * RestAPI yazmak için kullanılır.
 * Ucüncü taraf kişilere açılaiblir.
 *
 * URL adresler -> endpointler
 */
@RestController
@RequestMapping(VERSION+API+ SATIS)
public class SatisController {


    @GetMapping(SAVE)
    public String save(){
        return "kayıt başarılı";
    }

    @GetMapping(UPDATE)
    public String updateIslemiYap(){
        return "Guncelleme başarılı";
    }

    @GetMapping("/hataolustur")
    public String hataOlustur(){
        throw new RuntimeException("Hata oluştu beklenmeyen bir durum ilginç!!!");
    }
}
