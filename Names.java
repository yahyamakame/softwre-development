import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String fname = input.nextLine();
        System.out.println("Enter last name: ");
        String lname = input.nextLine();

        System.out.println("Welcome " + fname +" "+ lname + '!');
    }
}
