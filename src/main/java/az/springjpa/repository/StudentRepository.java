package az.springjpa.repository;


import az.springjpa.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByFirstName(String firstName);

    List<Student> findByFirstNameAndSecondName(String firstName, String secondName);

    @Query("SELECT s FROM Student s WHERE s.firstName = ?1 AND s.secondName = ?2 ")
    List<Student> findStudentWithJPQL(String firstName, String secondName);

    @Query(nativeQuery = true, value = "SELECT * FROM students s where s.first_Name = ?1 and s.second_Name = ?2 ")
    List<Student> findStudentWithNativeSQL(String firstName, String secondName);
}

