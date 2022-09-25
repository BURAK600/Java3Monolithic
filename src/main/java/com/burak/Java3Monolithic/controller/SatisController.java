package com.burak.Java3Monolithic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestAPI yazmak için kullanılır.
 * Ucüncü taraf kişilere açılaiblir.
 *
 * URL adresler -> endpointler
 */
@RestController
@RequestMapping("/satis")
public class SatisController {


    @GetMapping("/save")
    public String save(){
        return "kayıt başarılı";
    }

    @GetMapping("/update")
    public String updateIslemiYap(){
        return "Guncelleme başarılı";
    }
}
