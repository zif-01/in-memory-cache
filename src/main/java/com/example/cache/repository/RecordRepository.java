package com.example.cache.repository;

import com.example.cache.model.Record;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RecordRepository extends CrudRepository<Record, String> {
    Optional<Record> findByAccount(long account);
    Optional<Record> findByName(String name);
    Optional<Record> findByValue(double value);
}
