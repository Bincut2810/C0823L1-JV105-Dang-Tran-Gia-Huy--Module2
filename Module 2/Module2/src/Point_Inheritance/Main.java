package Point_Inheritance;

public class Main {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint();
        MovablePoint p2 = new MovablePoint(2,5,6,8);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p2.move());
        System.out.println(p2);
    }
}
