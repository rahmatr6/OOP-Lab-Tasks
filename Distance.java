public class Distance {
    private int feet;
    private int inches;

    public Distance() {
        feet = 0;
        inches = 0;
    }

    public Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public void display() {
        System.out.println("Distance: " + feet + " feet " + inches + " inches");
    }

    public static void main(String[] args) {
        Distance d1 = new Distance();
        Distance d2 = new Distance(5, 8);

        d1.display();
        d2.display();
    }
}
