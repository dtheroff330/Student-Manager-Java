public class Student {

    private String studentID;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int age;
    private int[] grades;

    public String getStudentID(){
        return this.studentID;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getEmailAddress(){
        return this.emailAddress;
    }
    public int getAge(){
        return this.age;
    }
    public int[] getGrades(){
        return this.grades;
    }

    public void setStudentID(String studentID){
        this.studentID = studentID;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGrades(int[] grades){
        this.grades = grades;
    }

    public Student(String studentID, String firstName, String lastName, String emailAddress,
                   int age, int[] grades) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.age = age;
        this.grades = grades;
    }

    public void print() {
        System.out.println(getStudentID() +
            "\tFirst Name: " + getFirstName() +
            "\tLast Name: " + getLastName() +
            "\tEmail Address: " + getEmailAddress() +
            "\tAge: " + getAge() +
            "\tGrades: {" + getGrades()[0] + ", " + getGrades()[1] + ", " + getGrades()[2] + "}");
    }
}
