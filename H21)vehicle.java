class Vehicle {
    private String licensePlate;
    private String owner;

    public Vehicle(String licensePlate, String owner) {
        this.licensePlate = licensePlate;
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getOwner() {
        return owner;
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String licensePlate, String owner, int numDoors) {
        super(licensePlate, owner);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }
}

class Truck extends Vehicle {
    private int maxLoad;

    public Truck(String licensePlate, String owner, int maxLoad) {
        super(licensePlate, owner);
        this.maxLoad = maxLoad;
    }

    public int getMaxLoad() {
        return maxLoad;
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("ABC123", "John Doe", 4);
        System.out.println("Car's License Plate: " + car.getLicensePlate());
        System.out.println("Car's Owner: " + car.getOwner());
        System.out.println("Number of Doors: " + car.getNumDoors());

        Truck truck = new Truck("DEF456", "Jane Doe", 1000);
        System.out.println("\nTruck's License Plate: " + truck.getLicensePlate());
        System.out.println("Truck's Owner: " + truck.getOwner());
        System.out.println("Maximum Load: " + truck.getMaxLoad());
    }
}
