import java.util.Scanner;

public class Land {
    public static void main(String[] args) {
        double totalAcre;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total square feet of land: ");
        double squareFeet = input.nextDouble();
        totalAcre = squareFeet/43560;
        System.out.println("Total acres is: " + totalAcre);
    }
}
