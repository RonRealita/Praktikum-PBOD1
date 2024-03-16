//Nama: Rona Realita
//NIM: 24060122140124
//Hari, Tanggal: Sabtu, 16-03-2024

import java.util.List;
import java.util.ArrayList;

public class Course {
    private String courseCode;
    private String courseName;
    private Lecture lecture;
    private List<Student> studentsEnrolled;

    public Course(String courseCode, String courseName, Lecture lecture) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecture = lecture;
        this.studentsEnrolled = new ArrayList<>();
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public void addStudent(Student student) {
        studentsEnrolled.add(student);
    }

    public void removeStudent(Student student) {
        studentsEnrolled.remove(student);
    }

    public void viewEnrolledStudents() {
        for (Student student : studentsEnrolled) {
            student.getDetails();
        }
    }

    public void getDetails() {
        System.out.println("\nCourse Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Lecture: " + lecture.getName());
    }
}
