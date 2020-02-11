package com.testjava.BelajarSpringJPA.dao;


// import java.util.List;x
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.testjava.BelajarSpringJPA.model.Mahasiswa;

@Repository
public interface MahasiswaRepository extends JpaRepository<Mahasiswa, Long> {
   
}
