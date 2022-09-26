package com.burak.Java3Monolithic.service;

import com.burak.Java3Monolithic.repository.IMusteriRepository;
import com.burak.Java3Monolithic.repository.entity.Musteri;
import com.burak.Java3Monolithic.utility.ServiceManager;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Dikkat! @Service annotation eklenmelidir.
 *
 */
@Service
public class MusteriService extends ServiceManager<Musteri, Long> {
    /**
     * interface olarak eklediğimiz Service ya da Repository gibi sınıflarından intance almak için Spring @Autowired
     * annotaion ını kullanabiliriz.
     *
     */

/*    @Autowired
    IMusteriRepository iMusteriRepository;
    */

    private final IMusteriRepository iMusteriRepository;

    public MusteriService(IMusteriRepository repository) {
        super(repository);
        this.iMusteriRepository = repository;
    }


    public List<Musteri> findByAdres(String adres){
       return  iMusteriRepository.findByAdres(adres);
    }




}
