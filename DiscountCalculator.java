import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();
        System.out.print("Enter the price per item: ");
        double pricePerItem = input.nextDouble();
        double totalExpense;

        if (quantity > 50) {
            totalExpense = quantity * pricePerItem * 0.9; // 10% discount
        } else if (quantity >= 25) {
            totalExpense = quantity * pricePerItem * 0.95; // 5% discount
        } else {
            totalExpense = quantity * pricePerItem; // No discount
        }

        System.out.println("Total expenses: " + totalExpense);
        input.close();
    }
}
