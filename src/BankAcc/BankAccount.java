package BankAcc;

public class BankAccount {

    private static int nextId = 1;
    private static double sharedInterest = 0.2;

    private int id;
    private double balance;

    public BankAccount(){
        this.id = nextId++;
        this.balance = 0;
    }

    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        this.balance += amount;
    }

   public static void seInterestRate(double interestRate){
        sharedInterest = interestRate;
   }

   public double getInterest(int years){
        return balance * sharedInterest * years;
   }

   public static double getSharedInterest(){
        return sharedInterest;
   }
}

