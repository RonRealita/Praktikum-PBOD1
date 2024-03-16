//Nama: Rona Realita
//NIM: 24060122140124
//Hari, Tanggal: Sabtu, 16-03-2024

import java.util.List;
import java.util.ArrayList;

public class Student extends Person {
    private int studentID;
    private List<Course> coursesEnrolled;

    public Student(String name, int age, String address, int studentID) {
        super(name, age, address);
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void enrollCourse(Course course) {
        coursesEnrolled.add(course);
    }

    public void viewEnrolledCourses() {
        for (Course course : coursesEnrolled) {
            course.getDetails();
        }
    }

    public void getDetails() {
        super.getDetails();
        System.out.println("Student ID: " + studentID);
        System.out.println("Courses Enrolled: ");
        for (Course course : coursesEnrolled) {
            System.out.println("- " + course.getCourseName());
        }
    }
}
