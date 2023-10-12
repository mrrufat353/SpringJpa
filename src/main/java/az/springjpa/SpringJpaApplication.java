package az.springjpa;

import az.springjpa.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@Slf4j
@RequiredArgsConstructor
@ComponentScan(basePackages = {"az.springjpa.service", "az.springjpa.controller", "az.springjpa.repository"})
public class SpringJpaApplication implements CommandLineRunner {

    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//
//       Student student = new Student().builder()
//                .id(4L)
//                .firstName("Vusal")
//                .secondName("Ashrafli")
//                .age(20)
//                .studentNumber("AA1227787")
//                .build();
//        studentRepository.save(student);
    }
}
