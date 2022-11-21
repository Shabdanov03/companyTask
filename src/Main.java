import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student student = new Student(1L, "Shabdanov Ilim", 19, 'm', 12000);
        Student student1 = new Student(2L, "Djoldoshov Nuradil", 18, 'm', 12000);
        Student student2 = new Student(3L, "Akbaraliev Dastan", 19, 'm', 12000);
        Student student3 = new Student(4L, "Abdumomunov Sanjar", 19, 'm', 12000);
        Student student4 = new Student(5L, "Abdurazakova Nurgul", 20, 'f', 12000);
        Student[] students = {student, student1, student2, student3, student4};
        for (Student student5 : students) {
            System.out.println();
            System.out.println(student5);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Instructor instructor = new Instructor(5L, "Asangazieva Aijamal", 25, 'f', 65000);
        Instructor instructor1 = new Instructor(6L, "Asangaziev Aibek", 30, 'm', 40000);
        Instructor[] instructors = {instructor, instructor1};
        for (Instructor instructor2 : instructors) {
            System.out.println();
            System.out.println(instructor2);

        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        LocalDate dateOfStart = LocalDate.of(2022, 10, 3);
        LocalDate dateOfFinish = LocalDate.of(2023, 7, 3);
        Group group = new Group("Java-8", students, dateOfStart, dateOfFinish);
        Group group1 = new Group("JS-8", students, dateOfStart, dateOfFinish);
        Group[] groups = {group, group1};
        for (Group group2 : groups) {
            System.out.println(group2);
            System.out.println();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Mentor mentor = new Mentor(7L, "Toichubai uulu Mukhammed", 25, 'm', 50000);
        Mentor mentor2 = new Mentor(8L, "Kurbanov Rahim", 20, 'm', 50000);
        Mentor mentor3 = new Mentor(9L, "Maksat Akyl", 30, 'm', 50000);
        Mentor[] mentors = {mentor, mentor2, mentor3};
        for (Mentor mentor1 : mentors) {
            System.out.println();
            System.out.println(mentor1);
        }
        Course course = new Course("java", groups, instructor, mentors);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
        System.out.println(" Oll people ages");
        System.out.println("----------------------------");
        Person[] people = {student, student1, student2, student3, student4, instructor, instructor1, mentor, mentor2, mentor3};
        Person.sortAge(people);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~``");
        System.out.println(" Students contracts "+Company.income(students));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(" Period mentor salary "+mentor.period(group));
        System.out.println(" Period student contracts "+student.period(group));


    }
}