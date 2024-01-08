import java.util.*;
class ATM 
{
  double balance=20000.00;
    void withdraw(int amount)
    {
        balance=balance-amount;
        System.out.println("INR "+amount+" has been withdrawnn from your account");
    }
    void deposit(int amount)
    {
        balance=balance+amount;
        System.out.println("INR "+amount+" has been deposited in your account");
    }
    void checkBalance()
    {
        System.out.println("Account balance: INR "+balance);
    }
}
public class bankAccount extends ATM
{
  static int choice;
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    ATM obj=new ATM();
    System.out.println("\t ATM");
    System.out.println("\t-----");
    System.out.print("Enter your account number: ");
    double accNo=sc.nextDouble();
    System.out.println("Choose your option:\nPress 1 to deposit\nPress 2 to withdraw\nPress 3 to check balance\nPress 4 to exit ");
    
    do{
      System.out.print("\nEnter your option: ");
      choice=sc.nextInt();
      if(choice==1)
      {
       System.out.print("Enter the amount to be deposited:");
       int amount=sc.nextInt();
       obj.deposit(amount);
      }
      else if(choice==2)
      {
       System.out.print("Enter the amount to be withdrawn:");
       int amount=sc.nextInt();
       obj.withdraw(amount);
      }
      else if(choice==3)
      {
       obj.checkBalance();
      }
      else if(choice==4)
      {
        System.out.println("Thank you for banking with us!");
      }
      else
      {
        System.out.println("Please enter the correct option number");
      }
    }while(choice!=4);
  }

}

