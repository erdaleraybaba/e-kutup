package com.kutuphhane.yeni.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Uye")
public class Uye {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private long id;


//    @OneToMany(targetEntity = Siparis.class,cascade = CascadeType.ALL)
//    @JoinColumn(name = "us_fk",referencedColumnName = "id")
//    private List<Siparis>  alimlar;

    @Column(name = "TCKNO",length = 11)
    private int tckno;
    @Column(name="Ad" )
    private String ad;
    @Column(name="Soyad")
    private String soyad;
    @Column(name = "İl")
    private String il;
    @Column(name = "İlce")
    private String ilce;
    @Column(name = "Cadde")
    private String cadde;
    @Column(name = "Sokak")
    private String sokak;
    @Column(name = "Numara",length = 3)
    private int numara;

    public Uye(List<Siparis> alimlar) {
        //this.alimlar = alimlar;
    }

    public Uye() {

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getTckno() {
        return tckno;
    }

    public void setTckno(char tckno) {
        this.tckno = tckno;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getCadde() {
        return cadde;
    }

    public void setCadde(String cadde) {
        this.cadde = cadde;
    }

    public String getSokak() {
        return sokak;
    }

    public void setSokak(String sokak) {
        this.sokak = sokak;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(char numara) {
        this.numara = numara;
    }

//    public List<Siparis> getAlimlar() {
//        return alimlar;
//    }
//
//    public void setAlimlar(List<Siparis> alimlar) {
//        this.alimlar = alimlar;
//    }

    public void setTckno(int tckno) {
        this.tckno = tckno;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public Uye(long id, int tckno, String ad, String soyad, String il, String ilce, String cadde, String sokak, int numara) {
        this.id = id;
        this.tckno = tckno;
        this.ad = ad;
        this.soyad = soyad;
        this.il = il;
        this.ilce = ilce;
        this.cadde = cadde;
        this.sokak = sokak;
        this.numara = numara;
    }
}
