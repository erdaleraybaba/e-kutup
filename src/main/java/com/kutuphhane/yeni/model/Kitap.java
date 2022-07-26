package com.kutuphhane.yeni.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "Kitaplar")
@Entity
public class Kitap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "ISBN")
    private int isbn;
    @Column(name = "Ad")
    private String ad;
    @Column(name = "SayfaSayisi")
    private int safyasayisi;
    @Column(name = "YayinTarihi")
    private Date yayintarihi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getSafyasayisi() {
        return safyasayisi;
    }

    public void setSafyasayisi(int safyasayisi) {
        this.safyasayisi = safyasayisi;
    }

    public Date getYayintarihi() {
        return yayintarihi;
    }

    public void setYayintarihi(Date yayintarihi) {
        this.yayintarihi = yayintarihi;
    }

}
