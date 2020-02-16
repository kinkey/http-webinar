package sda.webinar.http;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Classroom {

    public Classroom() {
    }

    public Classroom(String classRoomName) {
        this.classRoomName = classRoomName;
    }

    public List<Student> students = new ArrayList<>();
    public String classRoomName;

    public void addStudent(Student student){
        if(!students.contains(student)){
            students.add(student);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Classroom)) return false;
        Classroom classroom = (Classroom) o;
        return Objects.equals(classRoomName, classroom.classRoomName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classRoomName);
    }
}
