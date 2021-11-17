import java.util.Scanner;

public class Integers {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("First integer: ");
        double x = input.nextDouble();
        System.out.println("Second integer: ");
        double y = input.nextDouble();

        double quotient = x / y;
        System.out.println("Quotient is: " + quotient);
        double remainder = x % y;
        System.out.println("remainder is: " + remainder);
    }
}
