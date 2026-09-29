
class Car {
    public String company;
    public String model;
    public double price;

    public void displayDetails() {
        System.out.println("Company: " + company + " Model: " + model + " Price: " + price);
    }
}

public class CarRunner {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.company = "Toyota";
        car1.model = "Corolla";
        car1.price = 2500000;
        car1.displayDetails();
    }
}
