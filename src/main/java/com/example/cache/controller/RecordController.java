package com.example.cache.controller;

import com.example.cache.model.Record;
import com.example.cache.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/records")
public class RecordController {

    @Autowired
    private RecordService recordService;

    @PostMapping
    public void addRecord(@RequestBody Record record) {
        recordService.saveRecord(record);
    }

    @GetMapping("/{id}")
    public Optional<Record> getRecordById(@PathVariable String id) {
        return recordService.getRecordById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteRecord(@PathVariable String id) {
        recordService.deleteRecord(id);
    }

    @GetMapping("/account/{account}")
    public Optional<Record> getRecordByAccount(@PathVariable long account) {
        return recordService.findRecordByAccount(account);
    }

    @GetMapping("/name/{name}")
    public Optional<Record> getRecordByName(@PathVariable String name) {
        return recordService.findRecordByName(name);
    }

    @GetMapping("/value/{value}")
    public Optional<Record> getRecordByValue(@PathVariable double value) {
        return recordService.findRecordByValue(value);
    }
}
