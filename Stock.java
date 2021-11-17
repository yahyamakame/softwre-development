public class Stock {
     public static void main(String[] args) {
         double share = 1000;
         double purchase = 32.87;
          double sold = 33.92;
          double moneyPaid = purchase * share;
          System.out.println("amount paid by joe is: " + moneyPaid);
          double stockbrocker = 0.02 * purchase;
          System.out.println("Amount of commision joe paid to broker: " + stockbrocker);
          double moneySold = sold * share;
          System.out.println("Amount sold by joe is: " + moneySold);
          double stockbrockerSold = 0.02 * sold;
          System.out.println("Amount commision joe paid to stocker is:  "+stockbrockerSold);
          double MoneyLeft = moneySold - moneyPaid;
          System.out.println("Money left is : " + MoneyLeft + " He get the profit");

     }
}