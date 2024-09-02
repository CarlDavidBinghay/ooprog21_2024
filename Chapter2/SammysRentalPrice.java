import java.util.Scanner;

public class SammysRentalPrice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes rented: ");
        int minutes = input.nextInt();

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        double rentalCost = (hours * 40) + remainingMinutes;

        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's makes it fun in the sun. S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println();
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + remainingMinutes);
        System.out.println("Total price: $" + rentalCost);
    }
}