package ru.hogwarts.school;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import ru.hogwarts.school.controller.StudentController;
import ru.hogwarts.school.model.Student;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StudentControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private StudentController studentController;

    @Autowired
    private TestRestTemplate restTemplate;

    //@Test
    //public void contextLoads() throws Exception {
    //    Assertions.assertThat(studentController).isNotNull();
    //}



    //@Test
    //public void testDefaultMessage() throws Exception {
    //    Assertions.assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/", String.class))
    ///            .isEqualTo("WebApp is working!");
    //}

    //@Test
    //public void getStudentForIdTest() throws Exception {
    //    Assertions.assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/{id}", Student.class))
    //            .isNotNull();
    //}

    //@Test
    //public void findStudentByAgeTest() throws Exception {
    //    Assertions.assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/{id}", Student.class))
    //            .isNotNull();
    //}

    //@Test
    //public void findFacultyOfStudentTest() throws Exception {
    //    Assertions.assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/faculty/{studentId}", Student.class))
    ///            .isNotNull();
    //}

    //@Test
    //public void createStudentTest() throws Exception {
      //  Student student = new Student();
      //  student.setAge(10);
      //  student.setName("name");
      //  student.setId(1);
      //  Assertions.assertThat(this.restTemplate.postForObject("http://localhost:" + port , student, Student.class))
      //          .isNotNull();
   // }

    //@Test
    //public Student editStudentTest() throws Exception {
      //  Student student = new Student();
        //student.setAge(10);
        //student.setName("name");
        //student.setId(1);

     //   Assertions.assertThat(this.restTemplate.put("http://localhost:" + port + "/{id}",student))
     //   ;
   // }

    //@Test
    //public void deleteStudentTest() throws Exception {
   //     Assertions.assertThat(this.restTemplate.delete("http://localhost:" + port + "/{id}"))
   //             .
 //   }
}
