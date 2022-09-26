package com.burak.Java3Monolithic.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Table(name = "tblsatis")
@Entity
@AllArgsConstructor // parametreli constructorları bizim adımıza oluşturur.
@NoArgsConstructor // parametresiz constructorları oluşturur
@Data // @Getter @Setter
@SuperBuilder // builder pattern
public class Satis extends Default{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long musteriId;
    Long urunId;
    Double adet;
    Double fiyat;
    Double toplamFiyat;
    Long tarih;

}
