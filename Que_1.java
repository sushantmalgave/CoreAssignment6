import java.util.*;
import java.lang.Math;

//1. Create a class Student with 2 data members rollno and name. Create one method setData()
//    that takes roll number and student name as parameter and stores them in data members
//    rollno and name. Create one more method showData() to print the data member values.
//    Create another class ( main class) StudentDemo that creates Student class object and
//    calls setData() and showData() methods.

class Student
{
    int rollno;
    String name;
    
    void setData(int rollno, String name)
    {
        this.rollno=rollno;
        this.name=name;
    }
    
    void showData()
    {
        System.out.println("ID: "+rollno);
        System.out.println("Name: "+name);
    }
}

class Assignment6
{
    public static void main(String [] args)
    {
        Student obj=new Student();
        obj.setData(12345,"Sumit");
        obj.showData();
    }
}


