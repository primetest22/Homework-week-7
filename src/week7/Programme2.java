package week7;
//Write a java program to input any year like (ex.2007) and find out if it is leap year or not?

import java.util.Scanner;

public class Programme2 {
    public void leapYear() {
        int a;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Year: ");
        a = input.nextInt();

        String result = (a % 4 == 0) ? "Leap Year" : "Not a leap year";
        System.out.println("This Year is: " + result);

    }
    public static void main(String[] args) {
        Programme2 obj = new Programme2();
        obj.leapYear();
    }

}
