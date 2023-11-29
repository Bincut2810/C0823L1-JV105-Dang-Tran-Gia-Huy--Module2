package Class;
public class Fan {
     final int SLOW = 1;
     final int MEDIUM = 2;
     final int FAST = 3;
     private int speed;
     private boolean on;
     private double radius;
     private String color;

     public Fan() {
          speed = SLOW;
          on = false;
          radius = 5.0;
          color = "blue";
     }

     public int getSpeed() {
          return speed;
     }

     public void setSpeed(int speed) {
          this.speed = speed;
     }

     public boolean isOn() {
          return on;
     }

     public void setOn(boolean on) {
          this.on = on;
     }

     public double getRadius() {
          return radius;
     }

     public void setRadius(double radius) {
          this.radius = radius;
     }

     public String getColor() {
          return color;
     }

     public void setColor(String color) {
          this.color = color;
     }
     public Fan(int speed, boolean on, double radius, String color){
          this.speed = speed;
          this.on = on;
          this.radius = radius;
          this.color = color;
     }

     public String toString() {
          if (on) {
               return "Fan is on: Speed = " + speed + ",color = " + color + ", radius =" + radius;
          } else {
               return "Fan is off: color =" + color + ", radius = " + radius;
          }
     }

     public static void main(String[] args) {
          Fan fan1 = new Fan();
          fan1.setSpeed(3);
          fan1.setRadius(10);
          fan1.setOn(true);
          fan1.setColor("yellow");

          Fan fan2 = new Fan();
          fan2.setSpeed(2);
          fan2.setRadius(5);
          fan2.setColor("blue");
          fan2.setOn(false);

          Fan fan3 = new Fan(3,true,12,"red");

          System.out.println("Trang thai Fan 1:  " + fan1.toString());
          System.out.println("Trang thai Fan 2:  " + fan2.toString());
          System.out.println("Trang thai Fan 3: " + fan3.toString());
     }
}