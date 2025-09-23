package OOP.Part2;

class Student{

    static private int id;

    private String name;

    void getId(Student obj){
        System.out.println(obj.id);
    }

    Student(String name){
        this.name = name;
        Student.id++;
        System.out.println("Student Name "+name);

        System.out.println("Student Id "+Student.id);
    }
}

public class Static {
    public static void main(String[] args) {
        Student s1 = new Student("Charan");
       
        Student s2 = new Student("Kalyan");

        s1.getId(s1);
    }
}
