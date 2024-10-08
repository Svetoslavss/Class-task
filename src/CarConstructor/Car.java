package CarConstructor;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public Car(String brand){
        this.brand = brand;
        this.model = "Unknown";
        this.horsePower = -1;
    }
   public Car(String brand , String model ,int horsePower){
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.horsePower = -1;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void setHorsePower(int horsePower){
        this.horsePower = horsePower;
    }
    public int getHorsePower(){
        return horsePower;
    }
    public String generateInfo(){
        return String.format("The car is : %s %s - %d HP",brand , model , horsePower);
    }

}
