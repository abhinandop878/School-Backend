package com.nestDigital.schoolBackend.controller;

import com.nestDigital.schoolBackend.dao.SchoolDAO;
import com.nestDigital.schoolBackend.model.SchoolModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SchoolController {
    @Autowired
    private SchoolDAO dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addStudents",consumes = "application/json",produces = "application/json")
    public String addStudents(@RequestBody SchoolModel students){
        dao.save(students);
        return "{status:'success'}";
    }
    
    @CrossOrigin(origins = "*")
    @GetMapping("/viewStudents")
    public List<SchoolModel> viewStudents(){
        return (List<SchoolModel>)dao.findAll();
    }

}
