package Store;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int capacity = sc.nextInt();
       Storage storage = new Storage(capacity);

       while (true){
           String name = sc.nextLine();

           if(name.equalsIgnoreCase("done")){
               break;
           }
           double price = sc.nextDouble();

           int quantity = sc.nextInt();

           Product product = new Product(name , price , quantity);
       }
        System.out.println(storage.getProduct());
        System.out.println("Total cost : " + storage.getTotalCost());
    }
}
