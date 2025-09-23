
class Student {
    String name;
    int rollNo;
    float Marks;
    Student(String name){
        this.name = name;
        System.out.println("Object is created...");
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is deleted");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1;

        for(int i =0;i<10000000;i++){
            s1=new Student("Default name");
        }
        
    }
}
