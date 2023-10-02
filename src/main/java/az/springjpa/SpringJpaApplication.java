package az.springjpa;

import az.springjpa.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
@RequiredArgsConstructor
public class SpringJpaApplication implements CommandLineRunner {

    private final StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//        Student student = Student.builder()
//                .firstName("Mirrufat")
//                .secondName("Seyidov")
//                .age(20)
//                .studentNumber("AA1229868")
//                .build();
//        studentRepository.save(student);

    }
}
