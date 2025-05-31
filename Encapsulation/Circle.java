package Encapsulation;

import java.util.Scanner;

public class Circle {
    private double radius;
    // getter method
public void setRadius(double radius){
    this.radius=radius;
}
public double getRadius(){
    return radius;
}
class CircleArea{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Circle obj =  new Circle();
        System.out.println("Enter the radius : ");
        double userRadius =  scanner.nextDouble();
        obj.setRadius(userRadius);
        scanner.close();
        double pi = 3.14;
        obj.setRadius(0.5);
        // System.out.println(obj.setRadius());
        double area = pi*obj.getRadius()*obj.getRadius();
        System.out.println("Area of circle is:"+area);
    }
}
}
