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

    @PostMapping
    public Data updateRecord(@RequestBody Data data){
        return repo.save(data);
    }

    @DeleteMapping("/{I}")
    public void deleteRecord(@PathVariable int I){
        Data data = repo.findById(I).orElseThrow(() -> new RuntimeException("Record not found"));
        repo.delete(data);
    }

    @GetMapping
    public List<Data> showAllRecords(){
        return repo.findAll();
    }

//    @GetMapping("/filter")
//    public ArrayList<Data> filterRecords(@PathVariable String stream, @PathVariable String year, @PathVariable String role, @PathVariable String location){
//        String query = "SELECT * FROM tdp_table WHERE ";
//
//
//        return repo.filter(query);
//    }

}
