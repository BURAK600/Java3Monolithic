package com.burak.Java3Monolithic.controllermvc;

import com.burak.Java3Monolithic.dto.request.UrunSaveRequestDto;
import com.burak.Java3Monolithic.mvcmodel.HomeModel;
import com.burak.Java3Monolithic.service.UrunService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class HomeMvcController {
    private final UrunService urunService;

    @GetMapping("/home")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView();

        HomeModel homeModel = HomeModel.builder().menuListesi(Arrays.asList("Ana Sayfa", "Ürünler", "Hakkımızda", "İletişim"))
                .baslik("Satiş Yönetim Sistemi").avatar("https://www.w3schools.com/howto/img_avatar.png").kullaniciAdi("burakozer")
                .urunler(urunService.findAll())
                .build();

        modelAndView.addObject("model", homeModel);
        modelAndView.setViewName("home");
        return modelAndView;

    }
}
