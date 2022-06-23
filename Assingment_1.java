import java.util.Scanner;

public class Assingment_1 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
	/*
        System.out.println("Enter two floating point numbers to multiply:- ");
        float x = in.nextFloat();
        float y = in.nextFloat();
        System.out.println(Multiply_f(x,y));
	
	
        System.out.println("Enter two numbers to add:- ");
        int j = in.nextInt();
        int k = in.nextInt();
        System.out.println(AddNumbers(j,k));
	
	
        System.out.println("Enter two numbers to multiply:- ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(Multiply(a,b));
	*/

        System.out.println("Enter Your Name:- ");
        String name = in.nextLine();
        Welcome(name);
    }

    // Program to Multiply Two Floating-Point Numbers
    static float Multiply_f(float x, float y){
        return x * y;
    }
    // Program to add two number
    static int AddNumbers(int x, int y){
        return x + y;
    }
    static int Multiply(int x, int y){
        return x * y;
    }
    // Program to take input from the user
    static void Welcome(String name){
        System.out.println("Hello " + name + " Welcome to Java Web Programming.");
    }

}

