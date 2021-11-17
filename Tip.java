import java.util.Scanner;

public class Tip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter charge of food: ");
        double charge = input.nextDouble();
        double Tip = charge * 0.15;
        System.out.println("Tip is: " + Tip);
        double Tax = charge * 0.07;
        System.out.println("tax is: " + Tax);
        double total =  Tip + Tax;
        System.out.println("Total is : " + total);
    }
}
