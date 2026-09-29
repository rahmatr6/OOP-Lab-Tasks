public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1.0; // default radius
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.5);

        System.out.println("Circumference of c1: " + c1.calculateCircumference());
        System.out.println("Circumference of c2: " + c2.calculateCircumference());
    }
}
