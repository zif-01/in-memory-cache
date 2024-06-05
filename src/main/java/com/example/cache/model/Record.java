package com.example.cache.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("Record")
public class Record {
    @Id
    private String id;
    private long account;
    private String name;
    private double value;

    // constructors
    public Record() {
    }

    public Record(String id, long account, String name, double value) {
        this.id = id;
        this.account = account;
        this.name = name;
        this.value = value;
    }

    // getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getAccount() {
        return account;
    }

    public void setAccount(long account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
