package Vehicle;

import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(100 , 200);
        Vehicle vehicle = new Vehicle("a" , "b" , engine , 200);

        vehicle.drive(100);

    }
}

