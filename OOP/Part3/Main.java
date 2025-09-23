class Parent{

    protected String house ="1" ;

    void accessHouse(){
        System.out.println("House: " + house);
    }

}

class Child extends Parent{

    protected String car = "1";

    protected String house = "villa";

    void accessCar(){
        System.out.println("Car: " + car);
        System.out.println("House: " + house + super.house);
    }


}


public class Main{
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = (Child)p;
        
        p.accessHouse();
        c.accessCar();
    }

}