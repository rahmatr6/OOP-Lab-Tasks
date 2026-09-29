
import java.util.Scanner;

class Rectangle {
    private double length;
    private double width;

    public void setparameter(double l, double w) {
        length = l;
        width = w;
    }

    public void display() {
        System.out.println("Length: " + length + " Width: " + width + " Area: " + (length * width));
    }
}

public class RectangleRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();

        System.out.println("What is Length?");
        double l = sc.nextDouble();
        System.out.println("What is Width?");
        double w = sc.nextDouble();

        rect.setparameter(l, w);
        rect.display();
    }
}