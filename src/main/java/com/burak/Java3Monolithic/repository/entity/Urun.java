package com.burak.Java3Monolithic.repository.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import javax.persistence.*;

@Table(name = "tblurun")
@Entity
@AllArgsConstructor // parametreli constructorları bizim adımıza oluşturur.
@NoArgsConstructor // parametresiz constructorları oluşturur
@Data // @Getter @Setter
@SuperBuilder // builder pattern

public class Urun extends Default {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String ad;
    String marka;
    String model;
    Double fiyat;
    Integer stok;

}
