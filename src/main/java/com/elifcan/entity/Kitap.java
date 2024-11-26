package com.elifcan.entity;

import com.elifcan.utility.KitapDurumu;

import java.util.Arrays;

public class Kitap extends BaseEntity {

    private String ad;
    private Yazar[] yazar;
    private Yayin_Evi yayinEvi;
    private int basimYili;
    private KitapDurumu kdurumu;
    private Kiralama kiralama;
    private String kategori;
    private int sayfaSayisi;
    private String dil;
    private String kapakResmi;

    public String toString() {
        return "Kitap{" +
                "ad='" + ad + '\'' +
                ", yayinEvi=" + yayinEvi +
                ", basimYili=" + basimYili +
                ", kdurumu=" + kdurumu +
                ", kiralama=" + kiralama +
                ", kategori='" + kategori + '\'' +
                ", sayfaSayisi=" + sayfaSayisi +
                ", dil='" + dil + '\'' +
                ", kapakResmi='" + kapakResmi + '\'' +
                '}';
    }

    public Kitap() {
    }

    public Kitap(String ad, Yayin_Evi yayinEvi, int basimYili, KitapDurumu kdurumu,
                 String kategori, int sayfaSayisi, String dil, String kapakResmi) {
        this.ad = ad;
        this.yayinEvi = yayinEvi;
        this.basimYili = basimYili;
        this.kdurumu = kdurumu;
        this.kategori = kategori;
        this.sayfaSayisi = sayfaSayisi;
        this.dil = dil;
        this.kapakResmi = kapakResmi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Yazar[] getYazar() {
        return yazar;
    }

    public void setYazar(Yazar[] yazar) {
        this.yazar = yazar;
    }

    public Yayin_Evi getYayinEvi() {
        return yayinEvi;
    }

    public void setYayinEvi(Yayin_Evi yayinEvi) {
        this.yayinEvi = yayinEvi;
    }

    public int getBasimYili() {
        return basimYili;
    }

    public void setBasimYili(int basimYili) {
        this.basimYili = basimYili;
    }

    public KitapDurumu getKdurumu() {
        return kdurumu;
    }

    public void setKdurumu(KitapDurumu kdurumu) {
        this.kdurumu = kdurumu;
    }

    public Kiralama getKiralama() {
        return kiralama;
    }

    public void setKiralama(Kiralama kiralama) {
        this.kiralama = kiralama;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public String getDil() {
        return dil;
    }

    public void setDil(String dil) {
        this.dil = dil;
    }

    public String getKapakResmi() {
        return kapakResmi;
    }

    public void setKapakResmi(String kapakResmi) {
        this.kapakResmi = kapakResmi;
    }
}
