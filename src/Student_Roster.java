import java.util.ArrayList;

public class Student_Roster {

    private ArrayList<Student> studentRoster = new ArrayList<>(); // Roster ArrayList (3)


    public void add(String studentID, String firstName, String lastName, String emailAddress, int age, int grade1, int grade2, int grade3) {

        int[] grades = {grade1, grade2, grade3};
        Student student = new Student(studentID, firstName, lastName, emailAddress, age, grades);
        studentRoster.add(student);

    }

    public void remove(String studentID){
        boolean isFound = false;

        for (int i = 0; i < studentRoster.size(); i++) {
            Student student = studentRoster.get(i);
            if (student.getStudentID().equals(studentID)) {
                studentRoster.remove(i);
                isFound = true;
                System.out.println("Student with ID " + studentID + " was successfully removed."); // Added for clarity
                break;
            }
        }
        if (!isFound) {
            System.out.println("Error: Student " + studentID + " not found");
        }
    }

    public void print_all() {
        for (Student student : studentRoster) {
            student.print();
        }
        System.out.println();
    }

    public void print_average_grade(String studentID) {
        for (Student student : studentRoster) {
            if (student.getStudentID().equals(studentID)) {
                int[] grades = student.getGrades();
                double average = (grades[0] + grades[1] + grades[2]) / 3.0;
                System.out.printf("Student ID: %s average grade: %.2f%n", studentID, average);
            }
        }
    }

    public void print_invalid_emails() {
        for (Student student : studentRoster) {
            String email =  student.getEmailAddress();
            if (!email.contains("@") || !email.contains(".") || email.contains(" ")) {
                System.out.println(email + " is an invalid address");
            }
        }
    }

}
