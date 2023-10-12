package az.springjpa.repository;


import az.springjpa.domain.Student;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
@ComponentScan("az.springjpa.service")
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByFirstName(String firstName);

    List<Student> findByFirstNameAndSecondName(String firstName, String secondName);

    @Query("SELECT s FROM Student s WHERE s.firstName = ?1 AND s.secondName = ?2 ")
    List<Student> findStudentWithJPQL(String firstName, String secondName);

    @Query(nativeQuery = true, value = "SELECT * FROM students s where s.first_Name = ?1 and s.second_Name = ?2 ")
    List<Student> findStudentWithNativeSQL(String firstName, String secondName);

    @Query(value = "select s from Student s where (:firstName is null or s.firstName =:firstName)" +
            "and (:secondName is null or s.secondName =:secondName)" +
            "and (:age is null or s.age =:age)")
    List<Student> findStudentWithParams(
            @Param(value = "firstName") String firstName,
            @Param(value = "secondName") String secondName,
            @Param(value = "age") Integer age);
}

