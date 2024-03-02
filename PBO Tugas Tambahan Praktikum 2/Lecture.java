import java.util.List;
import java.util.ArrayList;

public class Lecture {
    String lectureName;
    int age;
    String address;
    int employeeID;
    List<Course> coursesTaught;

    public Lecture(String lectureName, int age, String address, int employeeID) {
        this.lectureName = lectureName;
        this.age = age;
        this.address = address;
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<Course>();
    }

    public String getLectureName(){
        return lectureName;
    }

    public int getAge(){
        return age;
    }

    public String getAddress(){
        return address;
    }

    public int getEmployeeID(){
        return employeeID;
    }

    public void setLectureName(String lectureName){
        this.lectureName = lectureName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setEmployeeID(int employeeID){
        this.employeeID = employeeID;
    }

    void getDetails() {
        System.out.println("Name: " + lectureName);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Employee ID: " + employeeID);
    }    

    void teachCourse(Course course) {
        coursesTaught.add(course); 
    }

    void viewTaughtCourses() {
        for (Course course : coursesTaught) {
            course.getDetails();
        }
    }
}
