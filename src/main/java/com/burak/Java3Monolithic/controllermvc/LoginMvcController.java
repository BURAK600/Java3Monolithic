package com.burak.Java3Monolithic.controllermvc;

import com.burak.Java3Monolithic.repository.entity.Musteri;
import com.burak.Java3Monolithic.service.MusteriService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginMvcController {

    private final MusteriService musteriService;

    @GetMapping("/loginpage")
    public ModelAndView loginGirisSayfasi() {

        /**
         * 1- Önce modelAndView nesnesi oluşturulur.
         * 2- Model nesnesinin hangi sayfayı yönetecegi belirlenir.
         */

        String ka = "Kullanıcı Adı";

        String sfr = "Şifre";

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("login");

        modelAndView.addObject("firma", "BilgeAdam");

        modelAndView.addObject("ka", ka);
        modelAndView.addObject("sifrelbl", sfr);
        return modelAndView;


    }

    @PostMapping("/dologin")
    public ModelAndView doLogin(String txtkullaniciadi, String txtsifre) {

        if (musteriService.isExistUser(txtkullaniciadi, txtsifre)) {
            System.out.println("Giris başarılı.");

            return new ModelAndView("redirect:/home");
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı");


        }
        return new ModelAndView("redirect:/login/loginpage");


    }

    @GetMapping("/registerpage")
    public ModelAndView register() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("register");
        return modelAndView;
    }

    @PostMapping("/doregister")
    public ModelAndView doregister(String email,
                                   String username,
                                   String password) {
        musteriService.save(
                Musteri.builder().email(email).username(username).password(password).build()
        );

        return new ModelAndView("redirect:loginpage");

    }

}
