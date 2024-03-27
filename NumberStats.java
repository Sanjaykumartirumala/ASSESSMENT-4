import java.util.Scanner;

public class NumberStats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE, count = 0;
        double sum = 0, average;

        System.out.println("Enter numbers (type 'exit' to finish):");
        while (input.hasNextInt()) {
            number = input.nextInt();
            sum += number;
            count++;
            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
        }

        if (count > 0) {
            average = sum / count;
            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }

        input.close();
    }
}
