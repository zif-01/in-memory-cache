package com.example.cache.repository;

import com.example.cache.model.Record;
import org.springframework.data.repository.CrudRepository;

public interface RecordRepository extends CrudRepository<Record, String> {
}
