package week7;

import java.util.Scanner;

public class Programme10 {
    static int a,b;
    static char ch;
    public static void calculation(){

        if(ch == '*') {
            System.out.println("Multiplication: " + (a * b));
        } else if (ch == '+') {
            System.out.println("Addition: " + (a + b));
        } else if (ch == '-') {
            System.out.println("subtraction: " + (a - b));
        } else if (ch == '/') {
            System.out.println("Division: " + (a/b));
        }
           else {
            System.out.println("Enter valid symbol:");
        }
            }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first input:");
        a = input.nextInt();
        System.out.println("Enter second input");
        b = input.nextInt();

        System.out.println("Enter Any symbol: * + - /");
        ch = input.next().charAt(0);

        calculation();

    }
}
