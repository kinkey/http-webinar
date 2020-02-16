package sda.webinar.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

import static sda.webinar.http.School.getSchool;

@RestController()
public class StudentController {


    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("asdsad"));
        return students;
    }

    @PostMapping(path = "/students", consumes = "application/json")
    public ResponseEntity<Classroom> addStudent(@RequestBody Student student, @RequestParam(value = "className") String className) {
        Classroom classroomByName = getSchool().getClassroomByName(className);
        if (classroomByName != null) {
            classroomByName.addStudent(student);
            return new ResponseEntity<>(getSchool().getClassroomByName(className), HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>(null, HttpStatus.I_AM_A_TEAPOT);
    }


}
