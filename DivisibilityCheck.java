import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number % 7 == 0 && number % 13 == 0) {
            System.out.println(number + " is divisible by both 7 and 13.");
            System.out.println("Quotient when divided by 7: " + (number / 7));
            System.out.println("Remainder when divided by 7: " + (number % 7));
            System.out.println("Quotient when divided by 13: " + (number / 13));
            System.out.println("Remainder when divided by 13: " + (number % 13));
        } else {
            System.out.println(number + " is not divisible by both 7 and 13.");
        }

        input.close();
    }
}
