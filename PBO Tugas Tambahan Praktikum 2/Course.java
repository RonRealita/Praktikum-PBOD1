import java.util.List;
import java.util.ArrayList;

public class Course {
    String courseCode;
    String courseName;
    Lecture lecture;
    List<Student> studentsEnrolled;

    public String getcourseCode(){
        return courseCode;
    }

    public String getcourseName(){
        return courseName;
    }

    public Lecture getlecture(){
        return lecture;
    }

    public void setcourseCode(String courseCode){
        this.courseCode = courseCode;
    }

    public void setcourseName(String courseName){
        this.courseName = courseName;
    }

    Course(String courseCode, String courseName, Lecture lecture) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecture = lecture;
        this.studentsEnrolled = new ArrayList<>();
    }

    void addStudent(Student student) {
        studentsEnrolled.add(student);
    }

    void removeStudent(Student student) {
        studentsEnrolled.remove(student);
    }

    void viewEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : studentsEnrolled) {
            student.getDetails();
        }
    }

    void getDetails() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Lecture: " + lecture.getLectureName());
    }      
}
