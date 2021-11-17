import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        double purchase;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount of purchase: ");
        purchase = input.nextDouble();
        System.out.println("The purchase is: " +purchase);
        double stateSales = purchase * 0.04;
        System.out.println("State sales is: " + stateSales);
        double countySales = purchase * 0.02;
        System.out.println("County sales is: " + countySales);
        double TotalSalesTax = stateSales + countySales;
        System.out.println("Total sales tax is: " + TotalSalesTax);
        double TotalofSales = purchase + TotalSalesTax;
        System.out.println("Total of sales: " + TotalofSales);
    }
}
