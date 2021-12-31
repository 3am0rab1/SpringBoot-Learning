package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student Ammar = new Student(
                    1L,
                    "Ammar Al-Dbabi",
                    LocalDate.of(2000, Month.OCTOBER,15),
                    "ammar.aldbabi@gmail.com"
            );


            Student Adam = new Student(
                    "Adam Smith",
                    LocalDate.of(2002, Month.JANUARY,17),
                    "smith.smith@gmail.com"
            );

            repository.saveAll(
              List.of(Ammar,Adam)
            );

        };
    }
}
