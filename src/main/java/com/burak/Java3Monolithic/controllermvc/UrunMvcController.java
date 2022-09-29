package com.burak.Java3Monolithic.controllermvc;

import com.burak.Java3Monolithic.dto.request.UrunSaveRequestDto;
import com.burak.Java3Monolithic.repository.entity.Urun;
import com.burak.Java3Monolithic.service.UrunService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/urunmvc")
@RequiredArgsConstructor

public class UrunMvcController {

   private final UrunService urunService;


    // http://localhost/9092/urun/save
    @PostMapping("/save")
    public ModelAndView save(UrunSaveRequestDto urunSaveRequestDto
                             ){
        urunService.save(urunSaveRequestDto);
        return new ModelAndView("redirect:/home");

    }
}
