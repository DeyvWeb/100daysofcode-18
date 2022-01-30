// Question 1. create a class cylinder and use getter and setters to set its radius and height 
// Question 2. use ➊ to calculate surface and volume of the cylinder 
// Question 3. Use a constructor and repeat ➊
// Question 4. Overload a constructor used to initialize a rectangle of length and breath 5 for using custom parameters 
// Question 5. Repeat ➊ for a sphere

import java.util.Scanner;

class Cylinder{
    
    private int radius;
    private int height;

    public Cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public double surfaceArea(){
        return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
    }

    public double volume(){
        return Math.PI*radius*radius*height;
    }

}

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(){
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength(){
        return length;
    }

    public int getBreadth(){
        return breadth;
    }
}


public class HarryEx10 {
    public static void main(String [] args){
        
    Cylinder mCylinder = new Cylinder(5,6);
    mCylinder.setHeight(6);
    System.out.println(mCylinder.getHeight());

    mCylinder.setRadius(5);
    System.out.println(mCylinder.getRadius());

    System.out.println(mCylinder.surfaceArea());
    
    System.out.println(mCylinder.volume());


    Rectangle r = new Rectangle(12,56);
    System.out.print(r.getLength());
    System.out.print(r.getBreadth());
}
}
