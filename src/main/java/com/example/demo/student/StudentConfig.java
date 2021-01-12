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
    // commandLineRunner is a functional interface
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {

            Student mariam = new Student(
                    1L,
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)

            );

            Student pedro = new Student(
                    1L,
                    "pedro",
                    "pedro@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)

            );

            repository.saveAll(
                    List.of(mariam, pedro)
            );


        };
    }
}
