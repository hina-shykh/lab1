import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for two numbers
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        // Calculate the sum
        int sum = addNumbers(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);

        // Close the scanner
        scanner.close();
    }

    public static int addNumbers(int x, int y) {
        return x + y;
    }
}

