import java.util.ArrayList;


interface Vehicle {
    String start();
    String stop();
    double fuelEfficiency();
    String getType();
}


class Car implements Vehicle {
    public String start() {
        return "The car starts.";
    }

    public String stop() {
        return "The car stops.";
    }

    public double fuelEfficiency() {
        return 30.0;
    }

    public String getType() {
        return "Car";
    }
}


class Bike implements Vehicle {
    public String start() {
        return "The bike starts.";
    }

    public String stop() {
        return "The bike stops.";
    }

    public double fuelEfficiency() {
        return 60.0;
    }

    public String getType() {
        return "Bike";
    }
}


class Truck implements Vehicle {
    public String start() {
        return "The truck starts.";
    }

    public String stop() {
        return "The truck stops.";
    }

    public double fuelEfficiency() {
        return 15.0;
    }

    public String getType() {
        return "Truck";
    }
}


public class VehicleRentalSystem {

    public static void main(String[] args) {

        ArrayList<Vehicle> v1 = new ArrayList<>();


        v1.add(new Car());
        v1.add(new Bike());
        v1.add(new Truck());


        for (Vehicle v : v1)
        {
            System.out.println("Vehicle Type: " + v.getType());

            System.out.println(v.start());

            System.out.println(v.stop());

            System.out.println("Fuel Efficiency: " + v.fuelEfficiency() + " mpg");

            System.out.println("--------------------------------------");
        }
    }
}
