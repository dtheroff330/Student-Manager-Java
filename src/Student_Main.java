public class Student_Main {
    public static void main(String[] args) {


        String[] students = {"1,John,Smith,John1989@gmail.com,20,88,79,59",
                "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
                "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
                "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
                "5,First,Last,yourname@email.com,23,95,89,90"};

        Student_Roster roster = new Student_Roster();

        for (String student : students) {
            String[] studentData = student.split(",");
            roster.add(studentData[0], studentData[1], studentData[2], studentData[3], Integer.parseInt(studentData[4]),
                    Integer.parseInt(studentData[5]), Integer.parseInt(studentData[6]), Integer.parseInt(studentData[7]));
        }

        roster.print_all();
        System.out.println(); // Added for output readability
        roster.print_invalid_emails();
        System.out.println(); // Added for output readability

        for (String student : students) {
            String[] studentData = student.split(",");
            String studentID = studentData[0];
            roster.print_average_grade(studentID);
        }

        System.out.println(); // Added for output readability
        roster.remove("3");
        roster.remove("3");



    }
}
