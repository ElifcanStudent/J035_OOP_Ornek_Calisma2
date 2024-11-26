package com.elifcan.repository;

import com.elifcan.entity.Kiralama;

import java.util.UUID;

public class KiralamaRepository implements Repository <Kiralama>{

    public void save(Kiralama entity) {

    }

    public void delete(Kiralama entity) {

    }

    public void update(Kiralama entity) {

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
