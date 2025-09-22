import java.util.ArrayList;

class Student {

    private static int counter = 00000;
    private String studentName;

    private String rollNumber = "23691F";

    public Student(String studentName) {
        counter++;
        this.studentName = studentName;
        this.rollNumber += counter;
        System.out.println("Student added with RollNumber : " + this.rollNumber);
    }

    public String getRollNumber() {
        return this.rollNumber;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void updateStudentName(String studentName) {
        this.studentName = studentName;
        System.out.println("Student Name is updated.....");
    }

}

class StudentAdmin {

    private ArrayList<Student> studentDetails = new ArrayList<>();

    public void addStudent(String studentName) {
        // Create the Student Object
        Student newStudent = new Student(studentName);
        studentDetails.add(newStudent);
    }

    public void displayAllStudent() {
        System.out.println("----------------------- Student Info --------------------------");
        for (Student student : studentDetails) {

            System.out.println("Student Roll Number : " + student.getRollNumber());

            System.out.println("Student Name : " + student.getStudentName());

        }
        System.out.println("-------------------------------------------------------");

    }

    public void getDetails(String studentId) {

        for (Student student : studentDetails) {

            if (student.getRollNumber().equals(studentId)) {
                System.out.println("Student Roll Number : " + student.getRollNumber());
                System.out.println("Student Name : " + student.getStudentName());
                System.out.println("-------------------------------------------------------");

                return;
            }
        }
        System.out.println("Student Not founded ........");
    }

    public void updateStudent(String studentRollNumber, String studentName) {
        for (Student student : studentDetails) {

            if (student.getRollNumber().equals(studentRollNumber)) {
                student.updateStudentName(studentName);
                return;
            }
        }
        System.out.println("Student Not found.....");
    }

    public void deleteStudent(String rollNumber){

        for(Student student:studentDetails){

            if(student.getRollNumber().equals(rollNumber)){
                studentDetails.remove(student);
                System.out.println("Student deleted ....");
                return;
            }
        }
        System.out.println("Student not found .........");
    }
}

public class Main {

    public static void main(String[] args) {

        StudentAdmin admin = new StudentAdmin();
        admin.addStudent("Charan");
        admin.addStudent("Sudha");

        admin.displayAllStudent();

        admin.getDetails("23691F2");

        admin.updateStudent("23691F2", "Sudha Rani");

        admin.displayAllStudent();

        admin.deleteStudent("23691F2");

        admin.displayAllStudent();
    }
}