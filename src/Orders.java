import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
import Cupcakes.Cupcake;
import Drinks.Drinks;

public class Orders {

  public Orders (ArrayList<Cupcake> cupcakeMenu, ArrayList<Drinks> drinkMenu) {

    ArrayList<Object> order = new ArrayList<Object>();

    Scanner input = new Scanner(System.in);
    System.out.println("\n\nHello customer. Would you like to place an order? (Y or N) ");
    String placeOrder = input.nextLine();


    if( placeOrder.equalsIgnoreCase("Y") ){
      order.add(LocalDate.now());
      order.add(LocalTime.now());
      System.out.println("\nHere is the menu.");

      System.out.println("CUPCAKES: ");
      int itemNumber = 0;

      for(int i=0; i<cupcakeMenu.size(); i++){
        itemNumber++;
        System.out.print(itemNumber + ". ");
        cupcakeMenu.get(i).type();
        System.out.print(" $" + cupcakeMenu.get(i).getPrice() + "\n");
      }

      System.out.println("\n\nDRINKS:");
      for(int j=0; j<drinkMenu.size(); j++) {
        itemNumber++;
        System.out.print(itemNumber + ". ");
        drinkMenu.get(j).type();
        System.out.print(" $" + drinkMenu.get(j).getPrice() + "\n");
      }

      boolean ordering = true;

      while(ordering){
        System.out.println("\nWhat would you like to order? (type item number).");
        int orderChoice = input.nextInt();
        input.nextLine();

        switch(orderChoice){
          case 1 -> {
            order.add(cupcakeMenu.get(0)) ;
            System.out.println("Item added to order!");
          }
          case 2 -> {
            order.add(cupcakeMenu.get(1));
            System.out.println("Item added to order!");
          }
          case 3 -> {
            order.add(cupcakeMenu.get(2));
            System.out.println("Item added to order!");
          }
          case 4 -> {
            order.add(drinkMenu.get(0));
            System.out.println("Item added to order!");
          }
          case 5 -> {
            order.add(drinkMenu.get(1));
            System.out.println("Item added to order!");
          }
          case 6 -> {
            order.add(drinkMenu.get(2));
            System.out.println("Item added to order!");
          }
          default -> System.out.println("Sorry, we don't have that on the menu.");
        }

        System.out.println("Would you like to order something else? (Y or N)");
        placeOrder = input.nextLine();

        if(placeOrder.equalsIgnoreCase("N")){
          ordering = false;
        }

      }

      System.out.println(order.get(0));
      System.out.println(order.get(1));

      double subTotal = 0.00;

      for(int i=2; i<order.size(); i++){
        if(order.get(i) == cupcakeMenu.get(0)){
          cupcakeMenu.get(0).type();
          System.out.println(cupcakeMenu.get(0).getPrice());
          subTotal += cupcakeMenu.get(0).getPrice();

        } else if (order.get(i) == cupcakeMenu.get(1)) {
          cupcakeMenu.get(1).type();
          System.out.println(cupcakeMenu.get(1).getPrice());
          subTotal += cupcakeMenu.get(1).getPrice();

        } else if (order.get(i) == cupcakeMenu.get(2)) {
          cupcakeMenu.get(2).type();
          System.out.println(cupcakeMenu.get(2).getPrice());
          subTotal += cupcakeMenu.get(2).getPrice();

        } else if (order.get(i) == drinkMenu.get(0)) {
          drinkMenu.get(0).type();
          System.out.println(drinkMenu.get(0).getPrice());
          subTotal += drinkMenu.get(0).getPrice();

        }  else if (order.get(i) == drinkMenu.get(1)) {
          drinkMenu.get(1).type();
          System.out.println(drinkMenu.get(1).getPrice());
          subTotal += drinkMenu.get(1).getPrice();

        } else if (order.get(i) == drinkMenu.get(2)) {
          drinkMenu.get(2).type();
          System.out.println(drinkMenu.get(2).getPrice());
          subTotal += drinkMenu.get(2).getPrice();
        }
      }

      System.out.println("subtotal: $" + subTotal);
      new CreateFile();
      new WriteToFile(order);

    } else {
      System.out.println("Have a nice day then.");
    }
  }
}
