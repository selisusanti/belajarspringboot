package com.testjava.BelajarSpringJPA.model;

// import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@EntityListeners(AuditingEntityListener.class)
//jika ada ini maka namanya dari sini kalau ga ada maka ikutin nama dari function
// @Table(name = " Mahasiswa Baru")
public class Mahasiswa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    //jika tidak ada ini maka nama dari kolom ambil dari default 
    //@Column(name = "nama mahasiswa")
    private String Nama;
    private String Jurusan;
    private String nim;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getJurusan() {
        return Jurusan;
    }

    public void setJurusan(String jurusan) {
        Jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    

}