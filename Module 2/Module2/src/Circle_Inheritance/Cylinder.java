package Circle_Inheritance;

public class Cylinder extends Circle {
    private int h;

    public Cylinder(float radius, String color, int h) {
        super(radius, color);
        this.h = h;
    }



    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
     static void getArea() {
        System.out.println("Tinh the tich");
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.getColor()+ '\''+
                super.getRadius()+'\''+
                "h=" + h +
                '}';
    }
}
