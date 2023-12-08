package Circle_Inheritance;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(3,"blue");
        System.out.println(circle.toString());
        Cylinder cylinder = new Cylinder(4,"red",8);
        System.out.println(cylinder.toString());
        Circle.getArea();
        Cylinder.getArea();
    }
}
