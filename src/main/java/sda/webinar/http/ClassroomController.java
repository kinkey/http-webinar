package sda.webinar.http;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static sda.webinar.http.School.*;

@RestController()
public class ClassroomController {

    @GetMapping("/classrooms")
    public ResponseEntity<List<Classroom>> getClassrooms() {
        return new ResponseEntity<>(getSchool().getClassrooms(), HttpStatus.OK);
    }

    @GetMapping("/classroom")
    public ResponseEntity<Classroom> getClassroomByName(@RequestParam(value = "className") String className) {
        return new ResponseEntity<>(getSchool().getClassroomByName(className), HttpStatus.FOUND);
    }

    @PostMapping("/classrooms")
    public ResponseEntity<List<Classroom>> addClassroom(@RequestBody Classroom classroom) {
        getSchool().addClassroomToSchool(classroom);

        return new ResponseEntity<>(getSchool().getClassrooms(), HttpStatus.CREATED);
    }
}
