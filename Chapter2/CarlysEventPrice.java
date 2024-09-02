import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of guests: ");
        int numGuests = input.nextInt();

        int pricePerGuest = 35;
        int totalPrice = numGuests * pricePerGuest;

        System.out.println("***************************************");
        System.out.println("* Carly's makes the food that makes *");
        System.out.println("* it a party.                    *");
        System.out.println("***************************************");

        System.out.println("Number of guests: " + numGuests);
        System.out.println("Price per guest: $" + pricePerGuest);
        System.out.println("Total price: $" + totalPrice);

        boolean isLargeEvent = numGuests >= 50;
        System.out.println("Large event: " + isLargeEvent);
    }
}