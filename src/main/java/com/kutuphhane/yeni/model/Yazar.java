package com.kutuphhane.yeni.model;

import javax.persistence.*;

@Entity
@Table(name = "Yazarlar")
public class Yazar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name ="Adi")
    private String adi;
    @Column(name = "Soyadi")
    private String soyadi;
    @Column(name = "Adresi")
    private String adres;
    @Column(name = "WebSitesi")
    private String websitesi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getWebsitesi() {
        return websitesi;
    }

    public void setWebsitesi(String websitesi) {
        this.websitesi = websitesi;
    }
}
