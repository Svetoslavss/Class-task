package BankAcc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.concurrent.Callable;

public class Main{
    private static final List<BankAccount> accounts = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            String [] command = sc.nextLine().split(" ");
            switch (command[0]){
                case "Create" :
                    BankAccount newAccount = new BankAccount();
                    accounts.add(newAccount);
                    System.out.println("Account ID" + newAccount.getId() + " created");
                    break;
                case "Deposit" :
                    int depositId = Integer.parseInt(command[1]);
                    double depositAmount = Double.parseDouble(command[2]);
                    BankAccount depositAccount = findAccount(depositId);

                    if(depositAccount != null){
                        depositAccount.deposit(depositAmount);
                        System.out.println("Deposited : " + depositAmount + " to account " + depositId);
                    } else {
                        System.out.println("Account does not exist.");
                    }
                    break;
                case "SetInterest" :
                    double interestRate = Double.parseDouble(command[1]);
                    BankAccount.seInterestRate(interestRate);
                    System.out.println("Interest rate set to " + interestRate + "% to all accounts");
                    break;
                case "GetInterest" :
                    int interestId = Integer.parseInt(command[1]);
                    int years = Integer.parseInt(command[2]);
                    BankAccount interestAccount = findAccount(interestId);

                    if(interestAccount != null){
                        double interest = interestAccount.getInterest(years);
                        System.out.println("Interest for account " + interestId + " years " + years + " to " + interest) ;
                    } else {
                        System.out.println("Account with id " + interestId + " is not found");
                    }
                    break;
                case "End" :
                    System.out.println("End of Session");
                    return;
                default:
                    System.out.println("The system is not working at this moment");
            }
        }
    }

private static BankAccount findAccount(int id){
        for (BankAccount account : accounts){
            if(account.getId() == id){
                return account;
            }
        }
        return null;
    }
}