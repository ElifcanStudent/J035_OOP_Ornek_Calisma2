package com.elifcan.repository;

import java.util.UUID;

public interface Repository <T>{

    void save(T entity);
    void delete(T entity);
    void update(T entity);
    T[] findAll();
    T findById(UUID uuid);
    boolean existById(UUID uuid);
    int count();
}
