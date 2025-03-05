package com.example.postgredb.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,"Ram", "Ram.miriyala@xym.com", null, 22)
        )
                ;
    }

}
