package com.burak.Java3Monolithic.repository;


import com.burak.Java3Monolithic.repository.entity.Musteri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


/**
 * !!! Dikkat !!!
 * Bu interface bir repository sınıfıdır. Bu nedenle Spring sınıflarını analiz ederken uzerinde bulunan anatation lara bakarak onların instance larını oluşturur.
 * Buraya mutlaka @Repository annotation ını eklemek gerekmektedir.
 *
 */
@Repository
public interface IMusteriRepository extends JpaRepository<Musteri, Long> {

    /**
     * Dikkat!!!
     *
     * Repository sınıfları içinde sorgu yazmak için özel kelimeleri kullanılır.
     *
     * 1- find : kelimesi yazılır
     * 2-
     *
     *
     */

    Musteri findByUsername(String userName);
    List<Musteri> findByAdres(String adres);

    /**
     * select * from tblmusteri where dogumtarihi > ?
     * @param dogumTarihi
     * @return
     */
    List<Musteri> findByDogumtarihiGreaterThan(int dogumTarihi);

    /**
     * Adında belli bir karakter aranılan kişileri getir
     * select * from tblmusteri where ad like '%?%'
     */

    List<Musteri> findAllByAdLike(String adGecenHarfler);

    /**
     * ad ve adresi a ile başlayanlar
     *
     * select * from tblmusteri where ad like '%a%' and adres like '%a%'
     */

    List<Musteri> findAllByAdStartsWith(String ad);

    /**
     * and ile birleştirdiğimiz sorgularda sıralama önemlidir.
     * @param ad
     * @param adres
     * @return
     */

    List<Musteri> findAllByAdStartingWithAndAdresStartingWith(String ad, String adres);

    /**
     * sorgularınız size her zaman sonuç dönmez bu nedenle null gelen sonuçlarda alabiliriz.
     * Optional kullanırız
     *
     */

    Optional<Musteri> findOptionalByUsername(String username);


    Optional<List<Musteri>> findAllOptionalByAdres(String adres);

    Musteri findTopByOrderByDogumtarihiDesc(); // sadece 1 kayıt getirir.



    List<Musteri> findTop3ByOrderByDogumtarihiDesc(); // ilk 3 kayıtı getirir

    Optional<List<Musteri>> findTop3OptionalByOrderByDogumtarihiDesc(); // ilk 3 kayıtı getirir Optional olarak


    /**
     * select * from tblmusteri where dogumtarihi > ? and dogumtarihi < ?
     *
     */
    List<Musteri> findAllByDogumtarihiBetween(int baslangic, int bitis);

    List<Musteri> findAllByAdresAndDogumtarihiBetween(String adres, int baslangıc, int bitis);

    /**
     * aktif olan müşterileri getir
     */

//    List<Musteri> findAllByIsactive(boolean isActive);
//
//    List<Musteri> findAllByIsactiveTrue(); // parametre olmadan da kullanılır.

    /**
     * id sini verdigim müşteriyi bul
     */

    Optional<Musteri> findOptionalById(Long id);

    /**
     * verilen ad ve soyada göre ara
     */

    Optional<List<Musteri>> findAllOptionalByAdAndSoyad(String ad, String soyad);

    /**
     * verilen ad ve soyada göre harf duyarlılığı olmadan getirme
     *
     * IgnoreCase kullanımı
     */
    Optional<List<Musteri>> findAllOptionalByAdIgnoreCaseAndSoyadIgnoreCase(String ad, String soyad);


    /**
     *
     * 555XXXXXXXXXXXXXXXXXX
     */
    Optional<List<Musteri>> findAllOptionalByTelefonStartingWith(String telefon);

    /**
     * XXXXX555XXXXXXXXXX
     */
    Optional<List<Musteri>> findAllOptionalByTelefonContaining(String telefon);

    /**
     *
     * mail adresi gmail olan Ankaralı ların listesi
     */

    Optional<List<Musteri>> findAllOptionalByEmailContainingAndAdres(String email, String adres);


    /**
     * Kelime bazlı sorguların yetersiz kaldıgı durumlarda, JPQL ya da HQL  ya da NATIVESQL yazılabilmektedir.
     */

    @Query("select m from Musteri m where m.email = ?1")
    Musteri senBulEmailAdresineGore(String email);

    @Query("select mst from Musteri mst where mst.ad =?1 and mst.soyad= ?2")
    Musteri bulAdSoyd(String ad, String soyad);

    /**
     * Native SQL kullanımı
     */

    @Query(value = "select * from Musteri where email= ?1", nativeQuery = true)
    List<Musteri> getirEmailAdresineGore(String email);





    /**
     * Parametre belirterek sorgu yapmak
     */

    @Query("select m from Musteri m where m.email = :paramemail and m.ad= :paramad")
    Musteri findByNameAndEmail(

            @Param("paramad") String musteriAdi,

            @Param("paramemail") String musteriEmaili

    );















}
