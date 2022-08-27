import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    ArrayList<Cupcake> cupCakeMenu = new ArrayList<Cupcake>();
    ArrayList<Drinks> drinkMenu = new ArrayList<Drinks>();

    Cupcake cupcake = new Cupcake();
    RedVelvet redVelvet = new RedVelvet();
    Chocolate chocolate = new Chocolate();

    Drinks water = new Drinks();
    Soda soda  = new Soda();
    Milk milk = new Milk();

    System.out.println("We are in the middle of creating the cupcake menu." +
        " We currently have three cupcakes on the menu but we need to decide on pricing.");

    System.out.println("We are deciding on the price for our standard cupcake. Here is the description: ");
    cupcake.type();
    System.out.println("\nHow much would you like to charge for the cupcake? " +
        "\n(Input a numerical number taken to 2 decimal places)");
    String priceText = input.nextLine();
    double price = Double.parseDouble(priceText);
    cupcake.setPrice(price);

    System.out.println("\nWe are deciding on the price for our Chocolate cupcake. Here is the description: ");
    chocolate.type();
    System.out.println("\nHow much would you like to charge for the Chocolate cupcake? " +
        "\n(Input a numerical number taken to 2 decimal places)");
    priceText = input.nextLine();
    price = Double.parseDouble(priceText);
    chocolate.setPrice(price);

    System.out.println("\nWe are deciding on the price for our Red Velvet cupcake. Here is the description: ");
    redVelvet.type();
    System.out.println("\nHow much would you like to charge for the RedVelvet cupcake? " +
        "(Input a numerical number taken to 2 decimal places)");
    priceText = input.nextLine();
    price = Double.parseDouble(priceText);
    redVelvet.setPrice(price);

    cupCakeMenu.add(cupcake);
    cupCakeMenu.add(chocolate);
    cupCakeMenu.add(redVelvet);

    System.out.println("\nThe price of the Standard cupcake is now: $" + cupCakeMenu.get(0).getPrice());
    System.out.println("The price of the Chocolate cupcake is now: $" + cupCakeMenu.get(1).getPrice());
    System.out.println("The price of the Red Velvet cupcake is now: $" + cupCakeMenu.get(2).getPrice());

    System.out.println("\nNow that we have the prices set for the cupcakes lets move onto the drinks.");
    water.type();
    System.out.println("How much would you like to charge for our standard drink? " +
        "(Input a numerical number taken to 2 decimal places)");
    priceText = input.nextLine();
    price = Double.parseDouble(priceText);
    water.setPrice(price);

    soda.type();
    System.out.println("How much would you like to charge for Soda? " +
        "(Input a numerical number taken to 2 decimal places)");
    priceText = input.nextLine();
    price = Double.parseDouble(priceText);
    soda.setPrice(price);

    milk.type();
    System.out.println("How much would you like to charge for Milk? " +
        "(Input a numerical number taken to 2 decimal places)");
    priceText = input.nextLine();
    price = Double.parseDouble(priceText);
    milk.setPrice(price);

    drinkMenu.add(water);
    drinkMenu.add(soda);
    drinkMenu.add(milk);

    System.out.println("\nThe price of Water is now: $" + drinkMenu.get(0).getPrice());
    System.out.println("The price of the Soda is now: $" + drinkMenu.get(1).getPrice());
    System.out.println("The price of the Milk is now: $" + drinkMenu.get(2).getPrice());

  }
}
