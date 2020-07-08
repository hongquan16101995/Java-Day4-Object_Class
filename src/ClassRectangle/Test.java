package ClassRectangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = sc.nextDouble();
        System.out.println("Enter height: ");
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your rectangle: " + rectangle.display());
        System.out.println("Area of your rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of your rectangle: " + rectangle.getPerimeter());
    }
}
