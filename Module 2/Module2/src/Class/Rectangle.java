package Class;

import java.util.Scanner;

public class Rectangle {
    double width;
    double height;
    public Rectangle() {

    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
    public String display() {
        return "Rectangle{ " + "width =" + width + ", height: " + height +"}";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = Double.parseDouble(sc.nextLine());
        System.out.println("Enter height: ");
        double height = Double.parseDouble(sc.nextLine());
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your rectangle \n" + rectangle.display());
        System.out.println("Perimeter: \n" + rectangle.getPerimeter());
        System.out.println("Area\n " + rectangle.getArea());
    }
}
