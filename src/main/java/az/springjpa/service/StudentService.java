package az.springjpa.service;

import az.springjpa.repository.StudentRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;


    @PostConstruct
    public void listByQueryMethods() {
        studentRepository.findByFirstName("Jesus")
                .stream()
                .forEach(System.out::println);

        studentRepository.findByFirstNameAndSecondName("Mirrufat", "Seyidov")
                .stream()
                .forEach(System.out::println);
    }

    @PostConstruct
    public void jpql() {
        studentRepository.findStudentWithJPQL("Mirrufat", "Seyidov")
                .stream()
                .forEach(System.out::println);
    }

    @PostConstruct
    public void sql() {
        studentRepository.findStudentWithNativeSQL("Jesus", "Cafarli")
                .stream()
                .forEach(System.out::println);

    }

}
