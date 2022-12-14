package com.burak.Java3Monolithic.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.MappedSuperclass;

@MappedSuperclass //!!! Önemli !!!
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Default {

    boolean isActive;
    Long createDate;
    Long updateDate;


}
