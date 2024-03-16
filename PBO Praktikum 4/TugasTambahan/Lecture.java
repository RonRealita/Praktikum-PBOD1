//Nama: Rona Realita
//NIM: 24060122140124
//Hari, Tanggal: Sabtu, 16-03-2024

import java.util.List;
import java.util.ArrayList;

public class Lecture extends Person {
    private int employeeID;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, int employeeID) {
        super(name, age, address);
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void teachCourse(Course course) {
        coursesTaught.add(course);
    }

    public void viewTaughtCourses() {
        for (Course course : coursesTaught) {
            course.getDetails();
        }
    }
}
