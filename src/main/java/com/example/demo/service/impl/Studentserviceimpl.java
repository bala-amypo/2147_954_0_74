package com.example.demo.service.impl;
import java.util.*;
import org.springframework.streotype.Service;
import com.example.demo.entity.Student;
@Service
public class Studentserviceimpl implements Studentservice{
    private final Map<Long , Student> store = new HashMap<>();
    private long counter = 1;
    @Override
    public Student insertStudent(Student st){
        st.setId(counter++);
        store.put(st.get(),st);
        return st;
    }
    @Override
    public List<Student>getAllStudents(){
        st.
    }
}