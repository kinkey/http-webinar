package sda.webinar.http;

public class Student {

    public Student() {
        lastId+=1;
        id=new Integer(lastId);
    }

    public Student(String studentName) {
        lastId+=1;
        id=new Integer(lastId);
        this.studentName = studentName;
    }

    private static int lastId=0;
    public Integer id;
    public String studentName;

}
