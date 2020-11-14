//2. Create a class Circle that has two data members, one to store the radius and
//    another to store area and three methods first init() method to input radius
//    from user, second calculateArea() method to calculate area of circle and third
//    display() method to display values of radius and area. Create class CircleDemo
//    (main class) that creates the Circle object and calls init(), calculateArea() and display() methods.

import java.util.Scanner;

class Circle
{
    int radius;
    float area;
    
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius: ");
        radius=sc.nextInt();
    }
    
    void calculateArea()
    {
        area=(float)(22/7.0f)*(radius*radius);
    }
    
    void display()
    {
        System.out.println("Area: "+area);
    }
}

class Que_2
{
    public static void main(String [] args)
    {
        Circle obj=new Circle();
        obj.init();
        obj.calculateArea();
        obj.display();
    }
}



