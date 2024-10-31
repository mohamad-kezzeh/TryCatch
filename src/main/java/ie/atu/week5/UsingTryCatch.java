package ie.atu.week5;
import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int number;
            while (true) {
                System.out.println("Enter a number between 0 and 9:");
                try {
                    number = Integer.parseInt(scanner.nextLine());
                    System.out.println("You entered: " + number);
                    break;  // Exit loop if input is valid
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number between 0 and 9.");
                }
            }
        }
    }
}
