package com.burak.Java3Monolithic.controllermvc;


import com.burak.Java3Monolithic.dto.response.MusteriFindByIdResponseDto;
import com.burak.Java3Monolithic.repository.entity.Musteri;
import com.burak.Java3Monolithic.service.MusteriService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/müsteri")
public class MusteriMvcController {

    private final MusteriService musteriService;

    @PostMapping("/save")
    public ModelAndView saveMusteri(String ad, String soyad, String adres){
        ModelAndView modelAndView = new ModelAndView();
        Musteri musteri = Musteri.builder().ad(ad).soyad(soyad).adres(adres)

                .build();
        musteriService.save(musteri);
        return new ModelAndView("redirect:/urunmvc/save");


    }
}
