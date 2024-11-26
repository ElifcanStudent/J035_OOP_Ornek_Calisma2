package com.elifcan.repository;

import com.elifcan.entity.Uye;

import java.util.UUID;

public class UyeRepository implements Repository <Uye>{
    public void save(Uye entity) {

    }

    public void delete(Uye entity) {

    }

    public void update(Uye entity) {

    }

    public Uye[] findAll() {
        return new Uye[0];
    }

    public Uye findById(UUID uuid) {
        return null;
    }

    public boolean existById(UUID uuid) {
        return false;
    }

    public int count() {
        return 0;
    }
}
