//Nama: Rona Realita
//NIM: 24060122140124
//Hari, Tanggal: Sabtu, 16-03-2024

public class Main {
    public static void main(String[] args) {
        Lecture mahera = new Lecture("Mahera", 35, "Ketileng", 000123);
        Lecture faris = new Lecture("Faris", 40, "Kedungmundu", 000124);

        Student samsul = new Student("Samsul", 20, "Jurang Blimbing", 140124);
        Student historia = new Student("Historia", 20, "Gondang", 130090);
        Student victor = new Student("Victor", 20, "Mulawarman", 120024);

        Course PAIK123 = new Course("PAIK123", "Algoritma Pemrogaqman", mahera);
        Course PAIK124 = new Course("PAIK124", "Basis Data", mahera);
        Course PAIK125 = new Course("PAIK125", "Metode Numerik", faris);

        mahera.teachCourse(PAIK123);
        mahera.teachCourse(PAIK124);
        faris.teachCourse(PAIK125);

        PAIK123.addStudent(samsul);
        PAIK123.addStudent(historia);
        PAIK123.addStudent(victor);
        PAIK124.addStudent(samsul);
        PAIK124.addStudent(historia);
        PAIK125.addStudent(samsul);
        PAIK125.addStudent(victor);

        samsul.enrollCourse(PAIK123);
        historia.enrollCourse(PAIK123);
        victor.enrollCourse(PAIK123);
        samsul.enrollCourse(PAIK124);
        historia.enrollCourse(PAIK124);
        samsul.enrollCourse(PAIK125);
        victor.enrollCourse(PAIK125);

        System.out.println("\nView Enrolled Courses's Samsul:");
        samsul.viewEnrolledCourses();
        System.out.println("======================================");
        System.out.println("\nView Taught Courses's Mahera:");
        mahera.viewTaughtCourses();
        System.out.println("======================================");
        System.out.println("\nView Enrolled Students in PAIK123:");
        PAIK123.viewEnrolledStudents();
        System.out.println("======================================");
        System.out.println("\nView Details Courses:");
        PAIK123.getDetails();
        PAIK124.getDetails();
        PAIK125.getDetails();
        System.out.println("======================================\n");
    }
}