package sda.webinar.http;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Classroom> classrooms;
    private static School INSTANCE;

    private School(){
        classrooms =  new ArrayList<>();
        classrooms.add(new Classroom("9A"));
    }

    public static School getSchool(){
        if(INSTANCE == null){
            INSTANCE = new School();
        }
        return INSTANCE;
    }

    public void addClassroomToSchool(Classroom classroom){
        if(!classrooms.contains(classroom)){
            this.classrooms.add(classroom);
        }
    }

    public List<Classroom> getClassrooms() {
        return classrooms;
    }

    public Classroom getClassroomByName(String name){
        for(Classroom c: classrooms){
            if(c.classRoomName.equals(name)){
                return c;
            }
        }
        return null;
    }
}
