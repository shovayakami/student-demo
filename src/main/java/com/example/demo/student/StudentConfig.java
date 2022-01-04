package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.JANUARY;

/**
 * Created by bikra on 1/2/2022 1:52 PM.
 */
@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return  args -> {
                    Student ram = new Student(
                            "Ram",
                            "ram@gmail.com",
                            LocalDate.of(2000, JANUARY,5)
                    );
                    Student shyam = new Student(
                            "Shyam",
                            "shyam@gmail.com",
                            LocalDate.of(2009, JANUARY,5)
                    );
                    Student hari = new Student(
                            "Hari",
                            "hari@gmail.com",
                            LocalDate.of(2006, JANUARY,5)
                    );

                    repository.saveAll(
                            List.of(ram, shyam, hari)
                    );

        };
    }
}
