import java.util.Scanner;

import org.w3c.dom.Text;

public class Purchase {
    public static void main(String[] args) {
        double mangoes;
        double chocolates;
        double strawbery;
        double guava;
        double orange;
        double MTaxSales;

        Scanner input = new Scanner(System.in);
        System.out.println("Price of mangoes is: ");
        mangoes = input.nextDouble();
        System.out.println("Price of chocolates is: ");
        chocolates = input.nextDouble();
        System.out.println("Price of strawbery is: ");
        strawbery = input.nextDouble();
        System.out.println("Price of guava is: ");
        guava = input.nextDouble();
        System.out.println("Price of orange is: ");
        orange = input.nextDouble();
        MTaxSales = mangoes * 0.06;
        System.out.println("Tax of mangoes is: " + MTaxSales);
        double CTaxSales = chocolates * 0.06;
        System.out.println("Tax of chocolates is: " + CTaxSales);
        double STaxSales = strawbery * 0.06;
        System.out.println("Tax of strawbery is: " + STaxSales);
        double GTaxSales = guava * 0.06;
        System.out.println("Tax of guava is: " + GTaxSales);
        double OTaxSales = orange * 0.06;
        System.out.println("Tax of orange is: " + OTaxSales);

        double Total = MTaxSales + CTaxSales+STaxSales+GTaxSales+OTaxSales;
        System.out.println("Total is:  " + Total);
    }
}