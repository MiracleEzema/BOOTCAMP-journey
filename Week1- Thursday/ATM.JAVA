import java.util.Scanner;
public class ATM{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double balance = 10000;
        int choice;
        do{
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdrawal");
            System.out.println("4. Exit");
            System.out.print("Choice");
                        choice = sc.nextInt();
            if (choice == 1){
                checkbalance(balance);
            }else if(choice == 2){
                balance = deposit(sc,balance);
            }else if(choice == 3){
                balance = withdrawal(sc, balance);
            }else if(choice == 4){
                System.out.println("Thank you! Bye. ");
            }else{
                System.out.println("Invalid choice!");
            }
        } while (choice != 4);
        sc.close();
    }
        public static void checkBalance(double balance){
            System.out.println("Your balance is: N" + balance);
        }
        public static double deposite(Scanner sc, double balance){
            System.out.print("How much to deposit? ");
            double amount = sc.nextDouble();
            balance = balance + amount;
            System.out.println("Deposited! New balance: N" + balance);
            return balance; 
        }
        public static double withdrawal(Scanner sc, double balance){
            System.out.print("How much to withdraw? ");
            double amount = sc.nextDouble();
            if (amount > balance){
                System.out.println("Sorry! insufficient funds! ");
            }else{
                balance = balance - amount;
                System.out.println("Withdrawn! New balance");
            }
            return balance;
        }
}