package Class;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
       return Math.pow(b,2) - 4*a*c;
    }
    public double getRoot1() {
       double delta;
       delta = getDiscriminant();
       if (delta < 0) {
           return 0;
       } else {
           return (-b + Math.pow(delta,0.5))/2*a;
       }
    }
    public double getRoot2() {
        double delta;
        delta = getDiscriminant();
        if (delta < 0){
            return 0;
        } else {
            return (-b - Math.pow(delta,0.5))/2*a;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Enter value of b");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Enter value of c");
        double c = Double.parseDouble(sc.nextLine());

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta >= 0) {
            System.out.println("Phuong trinh co 2 nghiem");
            System.out.println("r1 = " + quadraticEquation.getRoot1());
            System.out.println("r2 = " + quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phuong trinh co 1 nghiem kep = " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }

    }
}
