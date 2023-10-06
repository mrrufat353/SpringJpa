package az.springjpa.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class StudentController {


    @GetMapping("/students")
    private String getStudents(
            @RequestParam(name = "firstName") String firstName,
            @RequestParam(name = "secondName") String secondName,
            @RequestParam(name = "age") int age) {
        return "First Name: " + firstName + ", Second Name: " + secondName + ", Age: " + age;
    }
}
