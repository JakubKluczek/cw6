import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Student s = new Student("John", "Doe", "doe@wp.pl", "Warsaw, Zlota 12", "333-322-222", new Date(80, 1, 1));
        StudyProgramme it = new StudyProgramme("IT", "AAA", 7, 5);

        s.enrollStudent(it);
        s.addGrade(5, "PGO");
        s.addGrade(2, "APBD");

        Student s2 = new Student("ohn", "Doe", "doe@wp.pl", "Warsaw, Zlota 12", "333-322-222", new Date(80, 1, 1));
        StudyProgramme it2 = new StudyProgramme("IT", "AAA", 7, 5);

        s2.enrollStudent(it2);
        s2.addGrade(5, "PGO");
        s2.addGrade(2, "APBD");

        Student.promoteAllStudents();
        Student.displayInfoAboutAllStudents();





    }

    
}