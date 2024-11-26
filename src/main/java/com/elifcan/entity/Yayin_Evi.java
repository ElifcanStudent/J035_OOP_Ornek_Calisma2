package com.elifcan.entity;

import com.elifcan.utility.Cinsiyet;

import java.util.Arrays;

public class Yayin_Evi extends BaseEntity{

    private String ad;
    private String adres;
    private int kurulusYili;
    private Yazar[] yazarlar;

    public String toString() {
        return "Yayin_Evi{" +
                "ad='" + ad + '\'' +
                ", adres='" + adres + '\'' +
                ", kurulusYili=" + kurulusYili +
                ", yazarlar=" + Arrays.toString(yazarlar) +
                '}';
    }

    public Yayin_Evi() {
    }

    public Yayin_Evi(String ad, String adres, int kurulusYili) {
        this.ad = ad;
        this.adres = adres;
        this.kurulusYili = kurulusYili;

    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getKurulusYili() {
        return kurulusYili;
    }

    public void setKurulusYili(int kurulusYili) {
        this.kurulusYili = kurulusYili;
    }

    public Yazar[] getYazarlar() {
        return yazarlar;
    }

    public void setYazarlar(Yazar[] yazarlar) {
        this.yazarlar = yazarlar;
    }
}
