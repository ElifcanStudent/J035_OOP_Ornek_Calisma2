package com.elifcan.entity;

import com.elifcan.utility.State;

import java.util.UUID;

public class BaseEntity {
    private final UUID uuid;
    private State state;
    private Long createdAt;
    private Long updatedAt;

    public BaseEntity() {
        this.uuid = UUID.randomUUID();
        this.createdAt = System.currentTimeMillis();
        this.updatedAt = System.currentTimeMillis();
        this.state = State.ACTIVE;
    }

    public UUID getUuid() {
        return uuid;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }
}
