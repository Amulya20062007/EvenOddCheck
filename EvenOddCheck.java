import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Using the conditional operator to check even or odd
        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("The number " + number + " is " + result + ".");
    }
}