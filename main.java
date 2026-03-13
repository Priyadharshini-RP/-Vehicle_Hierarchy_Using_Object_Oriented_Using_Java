class Vehicle {
     String brand;
     int seats;
    public Vehicle(String brand, int seats) {
        this.brand = brand;
        this.seats = seats;
    }
    public String getBrand() {
        return brand;
    }
    public int getSeats() {
        return seats;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Seats: " + seats);
    }
}
class Car extends Vehicle {
    public Car(String brand, int seats) {
        super(brand, seats);
    }
    public void showCarDetails() {
        System.out.println("Car Details:");
        display();
    }
}
class Bike extends Vehicle {
    public Bike(String brand, int seats) {
        super(brand, seats);
    }
    public void showBikeDetails() {
        System.out.println("Bike Details:");
        display();
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 5);
        Bike bike = new Bike("Yamaha", 2);
        car.showCarDetails();
        System.out.println();
        bike.showBikeDetails();
    }
}