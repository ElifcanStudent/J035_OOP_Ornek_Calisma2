package com.elifcan.repository;

import com.elifcan.entity.Kitap;

import java.util.UUID;

public class KitapRepository implements Repository <Kitap>{
    public void save(Kitap entity) {

    }

    public void delete(Kitap entity) {

    }

    public void update(Kitap entity) {

    }

    public Kitap[] findAll() {
        return new Kitap[0];
    }

    public Kitap findById(UUID uuid) {
        return null;
    }

    public boolean existById(UUID uuid) {
        return false;
    }

    public int count() {
        return 0;
    }
}
