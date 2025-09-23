abstract class Parent{

    abstract public void carrer(String name);

    public void aboutMe(){
        System.out.println("This is about me");
    }
}

class Children extends Parent{
    public void carrer(String carrer){
        System.out.println("I want to become a "+carrer);
    }


    public void thisIsMine(){
        System.out.println("this is me");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent c = new Children();
        c.carrer("Charan");
        c.thisIsMine();
    }
}
