package az.springjpa.controller;

import az.springjpa.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Component
@ComponentScan("az.springjpa.service")
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/students")
    public String getStudents(
            @RequestParam(name = "firstName") String firstName,
            @RequestParam(name = "secondName") String secondName,
            @RequestParam(name = "age") Integer age) {

        return studentService.params(firstName, secondName, age);
    }
}


