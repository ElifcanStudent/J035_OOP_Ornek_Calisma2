package com.elifcan;


import com.elifcan.entity.*;
import com.elifcan.utility.Cinsiyet;
import com.elifcan.utility.KiralamaSuresi;
import com.elifcan.utility.KitapDurumu;
import com.elifcan.utility.UyelikKategorisi;

public class Main {
    public static void main(String[] args) {
        /**
         * Kitap
         * Bir kitabın birden fazla yazarı olabilir. Yayın evi olacak, uide, basım yılı,
         * kitabın durumu (Kırada, uygun, bakımda,elimizde yok(Enum)ve başka 4 adet adet daha
         * işe yae-rayabilecek özellik ekleyiniz.
         * --- Yazar
         * --- Yayın Evi
         * --- Üye
         * uuid, ad ,soyad, adres, telefon, Erkek/KAdın(enum), Standart, brınzi gümüş altın platin uyelik(enum),
         * --- Kiralama
         * kiralayan üye, kiralanan kitap(her kiralama 1 adet kitap içerir, kiralama tarihi,
         * kiralama iade günü, kitaplrın kiralama süresi standart 3-5-9-12-21 gün ile sınırlıdır.
         * --------
         * 1- Ahmet isimli üye hangi kitao yada kitapleı almıştrı.
         * 2- bir yayın evine ait kitaplar hangileri?
         * 3- belli bir kitabı kadınlar mı erkekler mi daha ço alıyor?
         * 4- kiralama iade tarihleri düşünüldüğünde bugün iade gelecek kitaplar hangileridir?
         * 5- bir A kitabı şuan kiralanabilir durumda mı?
         * 6- A kitabının yazar veya yazarları kimlerdir?
         * 7- A yazarının kitapları nelerdir?
         */

        Yayin_Evi yayin_Evi = new Yayin_Evi("Can Yayinlari", "Istanbul",1978);

        Kitap kitap =new Kitap("Satranc" ,yayin_Evi,1941, KitapDurumu.UYGUN,
                "Dram",110,"Türkçe","Erkal Yavi");
        Kitap kitap1 = new Kitap ("Amok Kosucusu", yayin_Evi,1939,KitapDurumu.KIRADA,
                "dram",120,"Almanca","Igor Dostayev");

        Yazar yazar = new Yazar("Stefan", "Zweig","Almanya", Cinsiyet.ERKEK, new Kitap [] {kitap,kitap1});

        kitap.setYazar(new Yazar [] {yazar});
        kitap1.setYazar(new Yazar [] {yazar});
        yayin_Evi.setYazarlar(new Yazar [] {yazar});

        Uye uye1 = new Uye("Elif","Can", "Ankara", Cinsiyet.KADIN,"0555 555 55 55", UyelikKategorisi.STANDART);
        Kiralama kiralama =new Kiralama(uye1, kitap, "22.11.2024", KiralamaSuresi.DOKUZ,"1.12.2024");


        System.out.println("Yazar Adi : " + yazar.getAd());
        System.out.println("Yazar Soyadi : " + yazar.getSoyad());
        System.out.println("Yazar Adres : " + yazar.getAdres());
        System.out.println("Yazar Cinsiyet : " + yazar.getCinsiyet());
        System.out.println("Kitap Listesi : " + yazar.getKitap()[0]);






    }
}