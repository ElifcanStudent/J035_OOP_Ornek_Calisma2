package com.elifcan.repository;

import com.elifcan.entity.Yazar;

import java.util.UUID;

public class YazarRepository implements Repository<Yazar>{
    public void save(Yazar entity) {

    }

    public void delete(Yazar entity) {

    }

    public void update(Yazar entity) {

    }

    public Yazar[] findAll() {
        return new Yazar[0];
    }

    public Yazar findById(UUID uuid) {
        return null;
    }

    public boolean existById(UUID uuid) {
        return false;
    }

    public int count() {
        return 0;
    }
}
