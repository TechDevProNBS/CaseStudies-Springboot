package com.nationwide.repositories;

import com.nationwide.entities.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepo extends JpaRepository<Data, Integer>{

}
