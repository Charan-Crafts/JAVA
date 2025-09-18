import java.util.Scanner;

public class Pizza {
    private boolean veg=true;

    private double price=200;

    private double extraCheesePrice=100;

    private double extraToppingPrice =50;

    Scanner in = new Scanner(System.in);
    
    Pizza(boolean veg){
        if(veg == false){
            this.price += 100;
            System.out.println("You Opted Non - Veg pizza ");
        }
        else{
            System.out.println("You Opted Veg pizza ");
        }

        System.out.println("Do you want Extra Cheese it may cost " + extraCheesePrice + "? (yes/no)");

        String cheeseChoice = in.nextLine();

        if(cheeseChoice.equalsIgnoreCase("yes")){
            addExtraCheese();
        }

        System.out.println("Do you want Extra Toppings it may cost " + extraToppingPrice + "? (yes/no)");

        String toppingChoice = in.nextLine();

        if(toppingChoice.equalsIgnoreCase("yes")){
            addExtraTopping();
        }

        System.out.println("Your total Bill is "+this.price);

        System.out.println("Thank u for ordering pizza");

    }

    public void addExtraCheese(){
        System.out.println("Extra Cheese Added");
        this.price+=extraCheesePrice;
    }

    public void addExtraTopping(){
        System.out.println("Extra Toppings Added");
        this.price+=extraToppingPrice;
    }


}
