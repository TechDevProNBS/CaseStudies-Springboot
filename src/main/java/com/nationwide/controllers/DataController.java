package com.nationwide.controllers;

import com.nationwide.entities.Data;
import com.nationwide.repositories.DataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/record")
public class DataController {

    @Autowired
    private DataRepo repo;

    @PostMapping
    public Data addRecord(@RequestBody Data data){
        return repo.saveAndFlush(data);
    }

    @PutMapping
    public Data updateRecord(@RequestBody Data data){
        return repo.save(data);
    }

    @DeleteMapping
    public void deleteRecord(@RequestBody int I){
        Data data = repo.findById(I).orElseThrow(() -> new RuntimeException("Record not found"));
        repo.delete(data);
    }

    @GetMapping
    public List<Data> showAllRecords(){
        return repo.findAll();
    }
}
