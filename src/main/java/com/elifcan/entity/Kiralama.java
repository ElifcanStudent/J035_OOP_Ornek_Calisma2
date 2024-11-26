package com.elifcan.entity;

import com.elifcan.utility.KiralamaSuresi;

public class Kiralama extends BaseEntity{

    private Uye uye;
    private Kitap kitap;
    private String kiralamaTarihi;
    public KiralamaSuresi kiralamaSuresi;
    public String iadeTarihi;

    public String toString() {
        return "Kiralama{" +
                "uye=" + uye +
                ", kitap=" + kitap +
                ", kiralamaTarihi='" + kiralamaTarihi + '\'' +
                ", kiralamaSuresi=" + kiralamaSuresi +
                ", iadeTarihi='" + iadeTarihi + '\'' +
                '}';
    }

    public Kiralama() {
    }

    public Kiralama(Uye uye, Kitap kitap, String kiralamaTarihi, KiralamaSuresi kiralamaSuresi,
                    String iadeTarihi) {
        this.uye = uye;
        this.kitap = kitap;
        this.kiralamaTarihi = kiralamaTarihi;
        this.kiralamaSuresi = kiralamaSuresi;
        this.iadeTarihi = iadeTarihi;
    }

    public Uye getUye() {
        return uye;
    }

    public void setUye(Uye uye) {
        this.uye = uye;
    }

    public Kitap getKitap() {
        return kitap;
    }

    public void setKitap(Kitap kitap) {
        this.kitap = kitap;
    }

    public String getKiralamaTarihi() {
        return kiralamaTarihi;
    }

    public void setKiralamaTarihi(String kiralamaTarihi) {
        this.kiralamaTarihi = kiralamaTarihi;
    }

    public KiralamaSuresi getKiralamaSuresi() {
        return kiralamaSuresi;
    }

    public void setKiralamaSuresi(KiralamaSuresi kiralamaSuresi) {
        this.kiralamaSuresi = kiralamaSuresi;
    }

    public String getIadeTarihi() {
        return iadeTarihi;
    }

    public void setIadeTarihi(String iadeTarihi) {
        this.iadeTarihi = iadeTarihi;
    }
}
