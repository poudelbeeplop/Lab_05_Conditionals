import java.util.Scanner;

public class BirthMonth
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash= "";

        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = in.nextInt();

        if (birthMonth >= 1 && birthMonth <= 12)
        {
            System.out.println("Your birth month is: " + birthMonth);
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You must enter a vails number not: " + trash);
            System.out.println("Run the program again with correct input!");
            System.exit( 0);
        }

    }

}
