package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Ammar Al-Dbabi",
                        21,
                        LocalDate.of(2000, Month.OCTOBER,15),
                        "ammar.aldbabi@gmail.com"
                )
        );
    }
}
