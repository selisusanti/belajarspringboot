package com.testjava.BelajarSpringJPA.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MahasiswaController {
     
    @RequestMapping(value="/getDataMahasiswa/{namaparam1}")
    public String getDataMahasiswa(@PathVariable("namaparam1") String np1) {
        return "ini Path Variable :"+np1;
    }



    

}

