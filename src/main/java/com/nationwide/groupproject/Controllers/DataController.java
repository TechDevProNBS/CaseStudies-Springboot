package com.nationwide.groupproject.Controllers;

import com.nationwide.groupproject.Repositories.DataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class DataController {
    private DataRepo repo;

    @Autowired
    public DataController(DataRepo repo){
        this.repo = repo;
    }

}
