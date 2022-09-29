package com.burak.Java3Monolithic.mvcmodel;

import com.burak.Java3Monolithic.repository.entity.Urun;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class HomeModel {

    String baslik;
    List<String> menuListesi;
    String kullaniciAdi;
    String avatar;
    List<Urun> urunler;
}
