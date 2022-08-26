import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    ArrayList<Cupcake> cupCakeMenu = new ArrayList<Cupcake>();

    Cupcake cupcake = new Cupcake();
    RedVelvet redVelvet = new RedVelvet();
    Chocolate chocolate = new Chocolate();

    System.out.println("We are in the middle of creating the cupcake menu." +
        " We currently have three cupcakes on the menu but we need to decide on pricing.");

    System.out.println("We are deciding on the price for our standard cupcake. Here is the description: ");
    cupcake.type();
    System.out.println("\nHow much would you like to charge for the cupcake?" +
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
    System.out.println("\nHow much would you like to charge for the RedVelvet cupcake?");
    priceText = input.nextLine();
    price = Double.parseDouble(priceText);
    redVelvet.setPrice(price);

    cupCakeMenu.add(cupcake);
    cupCakeMenu.add(chocolate);
    cupCakeMenu.add(redVelvet);

    System.out.println("\nThe price of the Standard cupcake is now: $" + cupCakeMenu.get(0).getPrice());
    System.out.println("The price of the Chocolate cupcake is now: $" + cupCakeMenu.get(1).getPrice());
    System.out.println("The price of the Red Velvet cupcake is now: $" + cupCakeMenu.get(2).getPrice());

  }
}