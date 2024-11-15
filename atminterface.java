// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

class ATMInterface {
   ATMInterface() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      BankAccount var2 = new BankAccount(500.0);
      System.out.println("Welcome to the ATM!");

      int var3;
      do {
         System.out.println("\n--- ATM Menu ---");
         System.out.println("1. Check Balance");
         System.out.println("2. Deposit");
         System.out.println("3. Withdraw");
         System.out.println("4. Exit");
         System.out.print("Enter your choice: ");
         var3 = var1.nextInt();
         switch (var3) {
            case 1:
               System.out.println("Current Balance: $" + var2.getBalance());
               break;
            case 2:
               System.out.print("Enter amount to deposit: $");
               double var4 = var1.nextDouble();
               var2.deposit(var4);
               break;
            case 3:
               System.out.print("Enter amount to withdraw: $");
               double var6 = var1.nextDouble();
               var2.withdraw(var6);
               break;
            case 4:
               System.out.println("Thank you for using the ATM. Goodbye!");
               break;
            default:
               System.out.println("Invalid choice. Please try again.");
         }
      } while(var3 != 4);

      var1.close();
   }
}
