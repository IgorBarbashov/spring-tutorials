package com.example.spring_boot_rest_api.students;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfiguration {

    @Bean
    public CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            studentRepository.saveAll(List.of(
                    new Student("Roma", "roma@gmail.com", LocalDate.of(2001, Month.OCTOBER, 12)),
                    new Student("Igor", "igor@gmail.com", LocalDate.of(1979, Month.SEPTEMBER, 3))
            ));
        };
    }
}
