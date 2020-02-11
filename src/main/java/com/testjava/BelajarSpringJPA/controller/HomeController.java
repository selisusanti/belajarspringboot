package com.testjava.BelajarSpringJPA.controller;

import java.util.List;

import javax.validation.Valid;

import com.testjava.BelajarSpringJPA.model.Mahasiswa;
import com.testjava.BelajarSpringJPA.dao.MahasiswaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;


// @Controller
@RestController

public class HomeController{

    @Autowired
    MahasiswaRepository mahasiswaRepository;
    RestTemplate restTemplate;

    @GetMapping(value = "getmahasiswa")
    public List<Mahasiswa> getAll(){
        return mahasiswaRepository.findAll();
    }

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping(value = "getMahasiswaValue")
    public Mahasiswa getMahasiswaValue(){
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setId(1);
        mahasiswa.setNama("seli");
        mahasiswa.setJurusan("TI");
        mahasiswa.setNim("12763713");
        return mahasiswa;
    }

    @GetMapping("/mahasiswa/{id}")
    public Mahasiswa getNoteById(@PathVariable(value = "id") Integer Id) {
        return mahasiswaRepository.findById(Id);
    }

    @PostMapping(value = "postMahasiswaValue")
    public Mahasiswa postMahasiswaValue(@Valid @RequestBody Mahasiswa mahasiswa ){
        // Mahasiswa mahasiswa = new Mahasiswa();
        // mahasiswa.setId(1);
        // mahasiswa.setNama("seli");
        // mahasiswa.setJurusan("TI");
        // mahasiswa.setNim("12763713");
        return mahasiswaRepository.save(mahasiswa) ;
    }

    //ambil nama dari appliacation properties
    @Value("${spring.application.name}")
    private String name;
    @Value("${server.port}")
    private String nomorport;
    @RequestMapping(value = "hello")
    public String hello() {
       return name+"="+nomorport;
    }




    // @DeleteMapping("/delete/{id}")
    // public ResponseEntity<?> deleteMahasiswa(@PathVariable(value = "id") Integer Id){
    //     Mahasiswa mahasiswa = mahasiswaRepository.findById(Id);

    //     mahasiswaRepository.delete(mahasiswa);
    //     return ResponseEntity.ok().build();
    // }
    

   


}
