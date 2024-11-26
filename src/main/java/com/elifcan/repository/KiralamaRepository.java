package com.elifcan.repository;

import com.elifcan.entity.Kiralama;
import com.elifcan.utility.DB;

import java.util.UUID;

import static com.elifcan.utility.DB.kiralamalar;

public class KiralamaRepository implements Repository <Kiralama>{

    private int index = 0;

    public void save(Kiralama entity) {
        kiralamalar[index++] = entity;
    }

    public void delete(Kiralama entity) {

    }

    public void update(Kiralama entity) {

    }
    public void listele(){
        for (int i = 0; i < kiralamalar.length; i++) {
            System.out.println(kiralamalar[i]);
        }
    }

    public Kiralama[] findAll() {
        return new Kiralama[0];
    }

    public Kiralama findById(UUID uuid) {
        return null;
    }

    public boolean existById(UUID uuid) {
        return false;
    }

    public int count() {
        return 0;
    }
}
