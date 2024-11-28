package com.elifcan.utility;

import com.elifcan.entity.Kiralama;
import com.elifcan.entity.Kitap;
import com.elifcan.entity.Uye;
import com.elifcan.entity.Yazar;

public class DB {
    public static Kiralama[] kiralama = new Kiralama[3];
    public static Uye[] uyeListesi = new Uye[3];

    public static OzelListe<Kitap> kitapListesi = new OzelListe<>();
    public static OzelListe<Yazar> yazarListesi = new OzelListe<>();
}
