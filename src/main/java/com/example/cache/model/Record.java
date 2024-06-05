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

    // Getters and Setters

    // Constructor

    public Record() {}

    public Record(String id, long account, String name, double value) {
        this.id = id;
        this.account = account;
        this.name = name;
        this.value = value;
    }

    // Getters and Setters
}
