package com.elifcan.repository;

import com.elifcan.entity.Yayin_Evi;
import com.elifcan.entity.Yazar;

import java.util.UUID;

public class YayinEviRepository implements Repository <Yayin_Evi>{

    public void save(Yayin_Evi entity) {

    }

    public void delete(Yayin_Evi entity) {

    }

    public void update(Yayin_Evi entity) {

    }

    public Yayin_Evi[] findAll() {
        return new Yayin_Evi[0];
    }

    public Yayin_Evi findById(UUID uuid) {
        return null;
    }

    public boolean existById(UUID uuid) {
        return false;
    }

    public int count() {
        return 0;
    }
}
