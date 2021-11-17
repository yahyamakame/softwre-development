import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        double profit;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total amount of sales: ");
        double TotalSales = input.nextDouble();
        profit = TotalSales* 0.23;
        System.out.println("Profit is: " + profit);

    }
}
