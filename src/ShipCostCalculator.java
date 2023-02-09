import java.util.Scanner;

public class ShipCostCalculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0.0;
        double shipCost = 0.0;
        double total = 0.0;
        final int SHIP_COST_CUTOFF = 100;
        final double SHIP_RATE = .02;
        String trash= "";

        System.out.print("Enter the item price: ");

        if(in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
            in.nextLine();
        }
        else // not a double must read as a string
        {
            trash = in.nextLine();
            System.out.println("You must enter a vails number not: " + trash);
            System.out.println("Run the program again with correct input!");
            System.exit( 0);
        }


        if(itemPrice < SHIP_COST_CUTOFF)
        {
            shipCost = itemPrice * SHIP_RATE;
        }

        total = itemPrice + shipCost;


        System.out.println(" Item Price " + itemPrice);
        System.out.println(" Shipping Cost " + shipCost);
        System.out.println(" Total cost " + total);

    }

}