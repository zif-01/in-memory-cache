package com.example.cache.service;

import com.example.cache.model.Record;
import com.example.cache.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RecordService {

    @Autowired
    private RecordRepository recordRepository;

    public void saveRecord(Record record) {
        recordRepository.save(record);
    }

    public Optional<Record> getRecordById(String id) {
        return recordRepository.findById(id);
    }

    public Iterable<Record> getAllRecords() {
        return recordRepository.findAll();
    }

    public void deleteRecord(String id) {
        recordRepository.deleteById(id);
    }

    public Optional<Record> findRecordByAccount(long account) {
        return recordRepository.findByAccount(account);
    }

    public Optional<Record> findRecordByName(String name) {
        return recordRepository.findByName(name);
    }

    public Optional<Record> findRecordByValue(double value) {
        return recordRepository.findByValue(value);
    }
}
