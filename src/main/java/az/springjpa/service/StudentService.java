package az.springjpa.service;

import az.springjpa.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
@Slf4j
@RequiredArgsConstructor
@Component
public class StudentService {

    private final StudentRepository studentRepository;

//    public void listByQueryMethods() {
//        studentRepository.findByFirstName("Jesus")
//                .forEach(System.out::println);
//
//        studentRepository.findByFirstNameAndSecondName("Mirrufat", "Seyidov")
//                .forEach(System.out::println);
//    }
//
//    public void jpql() {
//        studentRepository.findStudentWithJPQL("Mirrufat", "Seyidov")
//                .forEach(System.out::println);
//    }
//
//    public void sql() {
//        studentRepository.findStudentWithNativeSQL("Jesus", "Cafarli")
//                .forEach(System.out::println);
//
//    }

    public String params(String firstName, String secondName, Integer age) {
        studentRepository.findStudentWithParams(null, "Alizada", 20)
                .forEach(System.out::println);
        return studentRepository.findStudentWithParams(firstName, secondName, age).toString();
    }

}
