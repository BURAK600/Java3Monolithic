package com.burak.Java3Monolithic.service;

import com.burak.Java3Monolithic.repository.IUrunRepository;
import com.burak.Java3Monolithic.repository.entity.Urun;
import com.burak.Java3Monolithic.utility.ServiceManager;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UrunService extends ServiceManager<Urun, Long> {

   private final IUrunRepository iUrunRepository;


   public UrunService(IUrunRepository iUrunRepository) {
      super(iUrunRepository);
      this.iUrunRepository = iUrunRepository;
   }
}
