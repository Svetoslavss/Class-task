package Store;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private List<Product> storage;
    private int capacity;
    private int totalCost;

    public Storage(int capacity) {
        this.capacity = capacity;
        this.storage = new ArrayList<>();
    }

    public void addProduct(Product product){
        if (product.getQuentity() <= this.capacity){
            this.storage.add(product);
            this.capacity -= product.getQuentity();
            this.totalCost += product.getPrice() * product.getQuentity();
            System.out.println("Product added: " + product.getName());
        } else {
            System.out.println("Not enough capacity toAdd " + product.getName());
        }
    }

    public String getProduct(){
        StringBuilder productJson = new StringBuilder();

        for (Product product : this.storage){
            productJson.append(product.toJSON()).append("\n");
        }
        return productJson.toString();
    }

    public int getCapacity() {
        return capacity;
    }
    public double getTotalCost(){
        return totalCost;
    }
}
class Product{
    private String name;
    private double price;
    private int quentity;

    public Product(String name , double price , int quentity){
        this.name = name;
        this.price = price;
        this.quentity = quentity;
    }
    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuentity() {
        return quentity;
    }
    public String toJSON(){
        return "{" +
                "name : " + this.name +
                " price : " + this.price +
                " quantity : " + this.quentity + "}";
    }
}