package com.nationwide.groupproject.Controllers;

import com.nationwide.groupproject.Entities.Data;
import com.nationwide.groupproject.Repositories.DataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin("*")
public class DataController {
    private DataRepo repo;

    @Autowired
    public DataController(DataRepo repo){
        this.repo = repo;
    }

    @PostMapping("/AddRecord")
    public Data addRecord(@RequestBody Data data){
        repo.saveAndFlush(data);
        return data;
    }

    @PostMapping("/UpdateRecord")
    public Data updateRecord(@RequestBody Data data){
        repo.save(data);
        return data;
    }

    @DeleteMapping("/DeleteRecord/{I}")
    public void deleteRecord(@PathVariable long I){
        repo.delete(repo.findById(I));
    }

    @GetMapping("/ShowRecords")
    public ArrayList<Data> showAllRecords(){
        return repo.findAll();
    }

    @GetMapping("/Filter/{Stream}/{Year}/{Role}/{Location}")
    public ArrayList<Data> filterRecords(@PathVariable String stream, @PathVariable String year, @PathVariable String role, @PathVariable String location){
        String query = "SELECT * FROM tdp_table WHERE ";

        if(stream.equals("-1")){
            query += "NOT stream IS NULL AND";
        } else {
            query += "stream=" + stream;
        }

        if(year.equals("-1")){
            query += "NOT year IS NULL AND";
        } else {
            query += "year=" + year;
        }

        if(role.equals("-1")){
            query += "NOT role IS NULL AND";
        } else {
            query += "role=" + role;
        }

        if(location.equals("-1")){
            query += "NOT location IS NULL";
        } else {
            query += "location=" + location;
        }

        return repo.filter(query);
    }

}
