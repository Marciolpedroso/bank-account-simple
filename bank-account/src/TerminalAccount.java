import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Bank Account System.");
        System.out.println("Please enter your account number:");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Please enter your agency:"); 
        String agency = sc.nextLine();
        
        System.out.println("Please enter your account holder name:");
        String accountHolderName = sc.nextLine();

        System.out.println("Please enter your initial balance:");
        double initialBalance = sc.nextDouble();
        

        System.out.println("Account created successfully!");
        System.out.println("Hello " + accountHolderName + "! Thank you for creating an account in our Bank. Your agency is " + agency + " and your account number is " + accountNumber + ". Your balance is already to withdraw: " + initialBalance);

        sc.close();
    }

}

