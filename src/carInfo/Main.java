package carInfo;

import carInfo.Car;
// Main.java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        List<Car> cars = new ArrayList<>();

        for(int i = 0; i < N; i++){
            String carData = sc.nextLine();
            String[] parts = carData.split(" ");
            if(parts.length == 3) {
                String brand = parts[0];
                String model = parts[1];
                int horsePower = Integer.parseInt(parts[2]);

                Car car = new Car(brand, model, horsePower);
                cars.add(car);
            } else {
                System.out.println("Invalid input");
                return;
            }
        }

        for (Car car : cars){
            System.out.println(car.carInfo());
        }
    }
}