package com.example.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.streotype.Repository;
import com.example.demo.entity.Student;
@Repository
public interface Studentrepo extends JpaRepository<Student,Long>{
    
}