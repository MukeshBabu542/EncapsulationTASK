package Encapsulation;

public class Car {
    // Private instance variables
    private final String make;
    private final String model;
    private double rentalPricePerDay;
    private String availabilityStatus;

    public  String AVAILABLE = "Available";
    public  String RENTED = "Rented";

    // Constructor to initialize the car
    public Car(String make, String model, double rentalPricePerDay) {
        this.make = make;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
        this.availabilityStatus = AVAILABLE; // availability
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }


    public void setRentalPricePerDay(double rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }


    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    // Method to rent the car
    public void rentCar() {
        if (availabilityStatus==AVAILABLE) {
            availabilityStatus = RENTED;
            System.out.println("Car " + make + " " + model + " has been rented.");
        } else {
            System.out.println("Car " + make + " " + model + " is not available for rent.");
        }
    }

    // Method to return the car
    public void returnCar() {
        if (availabilityStatus==RENTED){
            availabilityStatus = AVAILABLE;
            System.out.println("Car " + make + " " + model + " has been returned.");
        } else {
            System.out.println("Car " + make + " " + model + " is already available.");
        }
    }

    // Method to print car details
    public void printCarDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Rental Price per Day: $" + rentalPricePerDay);
        System.out.println("Availability: " + availabilityStatus);
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 50.0);
        car.printCarDetails();

        car.rentCar();
        car.printCarDetails();

        car.returnCar();
        car.printCarDetails();
    }
}
