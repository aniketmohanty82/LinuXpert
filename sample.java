import java.util.Scanner;

public class FunctionalProgramming {

  // Function to add two numbers
  public static int add(int x, int y) {
    return x + y;
  }

  // Function to subtract two numbers
  public static int subtract(int x, int y) {
    return x - y;
  }

  // Function to multiply two numbers
  public static int multiply(int x, int y) {
    return x * y;
  }

  // Function to divide two numbers
  public static float divide(int x, int y) {
    return (float)x / y;
  }

  public static void main(String[] args) {
    // Get two numbers from the user
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();

    // Print the results of the operations
    System.out.println("The sum is: " + add(num1, num2));
    System.out.println("The difference is: " + subtract(num1, num2));
    System.out.println("The product is: " + multiply(num1, num2));
    System.out.println("The quotient is: " + divide(num1, num2));
  }
}
