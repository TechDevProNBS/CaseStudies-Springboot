package com.nationwide.services;

import org.springframework.stereotype.Service;

@Service
public class DataService {
    public String filter(String stream, String year, String role, String location){
        String query = "";
        if(stream.equals("-1")){
            query+= "NOT stream IS NULL";
        } else {
            query += "stream=" + stream;
        }

        query += " AND ";

        if(year.equals("-1")){
            query += "NOT year IS NULL";
        } else {
            query += "year=" + year;
        }

        query += " AND ";

        if(role.equals("-1")){
            query += "NOT role IS NULL";
        } else {
            query += "role=" + role;
        }

        query += " AND ";

        if(location.equals("-1")){
            query += "NOT location IS NULL";
        } else {
            query += "location=" + location;
        }

        return query;

    }
}
