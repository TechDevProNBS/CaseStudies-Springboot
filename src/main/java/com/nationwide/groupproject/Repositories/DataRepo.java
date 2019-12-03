package com.nationwide.groupproject.Repositories;

import com.nationwide.groupproject.Entities.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface DataRepo extends JpaRepository<Data, Integer>{
    Data findById(int I);
    ArrayList<Data> findAll();
    //Takes a query built in the DataController class to perform filtering with
    @Query(value="%query%")
    ArrayList<Data> filter(String query);

}
