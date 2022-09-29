package com.burak.Java3Monolithic.repository.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Table(name = "tblmusteri")
@Entity
@AllArgsConstructor // parametreli constructorları bizim adımıza oluşturur.
@NoArgsConstructor // parametresiz constructorları oluşturur
@Data // @Getter @Setter
@SuperBuilder // builder pattern

public class Musteri extends Default {
    /**
     * Tüm propertilerin getter ve setter ları eklenmeli
     *
     * parametreli ve parametresiz constructor
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ad;
    String soyad;
    String adres;
    String telefon;
    int dogumtarihi;
    String email;
    String username;
    String password;










}
