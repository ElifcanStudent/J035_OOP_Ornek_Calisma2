package com.elifcan.entity;

import com.elifcan.utility.Cinsiyet;
import com.elifcan.utility.UyelikKategorisi;

public class Uye extends BaseEntity {

    private String ad;
    private String soyad;
    private String adres;
    private Cinsiyet cinsiyet;
    private String tel;
    private UyelikKategorisi uyelikKategorisi;

    public String toString() {
        return "Uye{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", adres='" + adres + '\'' +
                ", cinsiyet=" + cinsiyet +
                ", tel='" + tel + '\'' +
                ", uyelikKategorisi=" + uyelikKategorisi +
                '}';
    }

    public Uye() {
    }

    public Uye(String ad, String soyad, String adres, Cinsiyet cinsiyet, String tel,
               UyelikKategorisi uyelikKategorisi) {
        this.ad = ad;
        this.soyad = soyad;
        this.adres = adres;
        this.cinsiyet = cinsiyet;
        this.tel = tel;
        this.uyelikKategorisi = uyelikKategorisi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Cinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Cinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public UyelikKategorisi getUyelikKategorisi() {
        return uyelikKategorisi;
    }

    public void setUyelikKategorisi(UyelikKategorisi uyelikKategorisi) {
        this.uyelikKategorisi = uyelikKategorisi;
    }
}
