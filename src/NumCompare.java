import java.util.Scanner;

public class NumCompare
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash= "";

        System.out.print("Enter the first number: ");
        if (!in.hasNextDouble())
        {
            System.out.println("Invalid input, please try again.");
            trash = in.nextLine();
            System.out.println("You must enter a vails number not: " + trash);
            System.out.println("Run the program again with correct input!");
            System.exit( 0);

        }

        double num1 = in.nextDouble();
        System.out.print("Enter the second number: ");
        if (!in.hasNextDouble())
        {
            System.out.println("Invalid input, please try again.");
            return;
        }
        double num2 = in.nextDouble();
        if (num1 == num2)
        {
            System.out.println("The numbers are equal.");
        }
        else if (num1 < num2)
        {
            System.out.println(num1 + " is less than " + num2 + ".");
        }
        else
        {
            System.out.println(num1 + " is greater than " + num2 + ".");
        }













    }
}
