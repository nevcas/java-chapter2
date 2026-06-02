import java.util.Scanner;

public class InvoiceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "y";

        System.out.println("Welcome to the Invoice Total Calculator");
        System.out.println();

        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter subtotal: ");
            String input = sc.nextLine();
            double subtotal = Double.parseDouble(input);

            double discountPercent = 0.0;
            if (subtotal >= 200) {
                discountPercent = 0.2;
            } else if (subtotal >= 100) {
                discountPercent = 0.1;
            }

            double discountAmount = subtotal * discountPercent;
            double total = subtotal - discountAmount;

            String message = "Discount percent: " + discountPercent + "\n" +
                             "Discount amount: " + discountAmount + "\n" +
                             "Invoice total: " + total + "\n";
            System.out.println(message);

            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        sc.close();
        System.out.println("Thank you for using the Invoice Total Calculator!");
    }
}