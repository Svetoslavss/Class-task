package CarConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // Consume the remaining newline

        List<Car> cars = new ArrayList<>();

        for(int i = 0 ; i < N ; i++){
            String carData = sc.nextLine();
            String [] parts = carData.split(" ");
            Car car;
            if(parts.length == 1){
                car = new Car(parts[0]);
            } else if (parts.length == 2) {
                String brand = parts[0];
                String model = parts[1];
                car = new Car(brand , model);
            } else if (parts.length == 3) {
                String brand = parts[0];
                String model = parts[1];
                int horsePower = Integer.parseInt(parts[2]);
                car = new Car(brand , model , horsePower);
            } else {
                System.out.println("Invalid input. ERROR!");
                continue;
            }
            cars.add(car);
        }

        for (Car car : cars){
            System.out.println(car.generateInfo());
        }
    }
}