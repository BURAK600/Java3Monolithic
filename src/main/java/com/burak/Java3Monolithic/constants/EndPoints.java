package com.burak.Java3Monolithic.constants;

public class EndPoints {

    /**
     * Uygulama ile ilgili tüm URL listesi buraya eklenir.
     *
     * http://localhost:9090/mkv1
     *
     */

    public static final String VERSION = "/mkv";
    public static final String WEB = "/web";
    public static final String API = "/api";



    /**
     * Tüm controller sınıfları icin EndPoint listesi
     *       http://localhost:9090/mkv1/web
     *       http://localhost:9090/mkv1/api
     */


    public static final String SATIS = "/satis";
    public static final String URUN = "/urun";
    public static final String MUSTERI = "/musteri";

    /**
     * Uygulama icin default olarak kullanılan tüm end pointlerin listesini ekleriz.
     *
     *
     */
    public static final String SAVE = "/save";
    public static final String UPDATE = "/update";
    public static final String DELETE = "/delete";
    public static final String GETALL = "/getall";
    public static final String GETBYID = "/getbyid";
    public static final String FINDALL = "/findall";
    public static final String FINDBYIDDTO = "/findbyiddto";
    public static final String FINDBYID = "/findbyid";


    /**
     * MUSTERİ işlemleri EndPointleri
     */

    public static final String FINDBYNAMEANDSURNAME = "/findbynameandsurname";

    /**
     * Urun işlemleri End Point leri
     *
     */
    public static final String URUNSAVEDTO = "/savedto";
}
