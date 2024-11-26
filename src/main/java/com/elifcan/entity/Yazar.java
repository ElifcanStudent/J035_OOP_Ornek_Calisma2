package com.elifcan.entity;

import com.elifcan.utility.Cinsiyet;

import java.util.Arrays;

public class Yazar extends BaseEntity{

    public Object setKitap;
    private String ad;
    private String soyad;
    private String adres;
    private Cinsiyet cinsiyet;
    private Kitap[] kitap;

    public String toString() {
        return "Yazar{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", adres='" + adres + '\'' +
                ", cinsiyet=" + cinsiyet +
                '}';
    }

    public Yazar() {
    }

    public Yazar(String ad, String soyad, String adres, Cinsiyet cinsiyet, Kitap[] kitap) {
        this.ad = ad;
        this.soyad = soyad;
        this.adres = adres;
        this.cinsiyet = cinsiyet;
        this.kitap = kitap;
    }

    public String getAd() {
        return ad;
    }

    public void setAd() {
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

    public Kitap[] getKitap() {
        return kitap;
    }

    public void setKitap(Kitap[] kitap) {
        this.kitap = kitap;
    }
}
