import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in celcius: ");
        double celcius = input.nextDouble();
        double F = (9/5) * celcius +32;
        System.out.println("Fahrenheit is: " + F);
    }
}
