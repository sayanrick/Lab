import java.util.Scanner;

public class ComplexNumber {
    // variable to hold real and imaginary part of complex number
    int real, imaginary;
    // Constructor which will be used while creating complex number
    public ComplexNumber(int r, int i){
        this.real = r;
        this.imaginary = i;
    }
    // this ShowNum function is to print real number
    public void ShowNum(){
        System.out.println(this.real + " +i" + this.imaginary);
    }
    // function for addition
    public static ComplexNumber add(ComplexNumber num1, ComplexNumber num2){
        ComplexNumber res = new ComplexNumber(0, 0);
        //adding real part
        res.real = num1.real + num2.real;
        //adding imaginary part
        res.imaginary = num1.imaginary + num2.imaginary;

        //returning the result
        return res;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a, b, c, d;
        System.out.println("Enter real part of 1st complex number:- ");
        a = in.nextInt();
        System.out.println("Enter imaginary part of 1st complex number:- ");
        b = in.nextInt();
        ComplexNumber com1 = new ComplexNumber(a,b);
        System.out.println("First Complex Number:- ");
        com1.ShowNum();
        System.out.println("Enter real part of 2nd complex number:- ");
        c = in.nextInt();
        System.out.println("Enter imaginary part of 1st complex number:- ");
        d = in.nextInt();
        ComplexNumber com2 = new ComplexNumber(c,d);
        System.out.println("2nd Complex Number:- ");
        com2.ShowNum();

        ComplexNumber res = add(com1, com2);

        System.out.println("Addition of two complex number:- ");
        res.ShowNum();
    }
}
