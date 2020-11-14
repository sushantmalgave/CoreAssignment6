
import java.util.Scanner;

//3. Create a class MathOperation that has four static methods. add() method that takes
//    two integer numbers as parameter and returns the sum of the numbers. subtract() method
//    that takes two integer numbers as parameter and returns the difference of the numbers.
//    multiply() method that takes two integer numbers as parameter and returns the product.
//    power() method that takes two integer numbers as parameter and returns the power of first
//    number to second number. Create another class Demo (main class) that takes the two numbers
//    from the user and calls all four methods of MathOperation class by providing entered numbers
//    and prints the return values of every method.

class MathOperation
{
    static int add(int a, int b)
    {
        return a+b;
    }
    
    static int subtract(int a, int b)
    {
        if(b>a)
            return b-a;
        else
        return a-b;
    }
    
    static int multiply(int a, int b)
    {
        return a*b;
    }
    
    static double power(int a, int b)
    {
        return Math.pow(a,b);
    }
}

class Que_3
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("a: ");
        int a=sc.nextInt();
        System.out.println("b: ");
        int b=sc.nextInt();
        
        System.out.println(MathOperation.add(a,b));
        System.out.println(MathOperation.subtract(a,b));
        System.out.println(MathOperation.multiply(a,b));
        System.out.println(MathOperation.power(a,b));
    }
}

