package week7;

import java.util.Scanner;

public class Programme4 {
    static int year,month;

    public void isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                System.out.println("It is a Leap Year");
            } else {
                System.out.println("It is not a Leap Year");
            }
        } else {
            System.out.println("false");
        }
    }
   public static void getDaysInMonth(int month, int year) {
       int day;
       System.out.println("How many days in month:");

       switch (month) {

           case 1:
           case 3:
           case 5:
           case 7:
           case 10:
           case 12:
               day = 31;
               System.out.println(day);
               break;
           case 2:
               if (year % 4 == 0) {
                   day = 29;
                   System.out.println(day);
               } else {
                   day = 28;
                   System.out.println(day);
               }
               break;
           case 4:
           case 6:
           case 8:
           case 9:
           case 11:
               day = 30;
               System.out.println(day);
               break;
           default:
               System.out.println("Not a valid month");
       }

   }
    public static void main(String[] args) {
        char ch;
        Programme4 obj = new Programme4();
        Scanner input = new Scanner(System.in);

        //System.out.println("Enter Year:");
       // year = input.nextInt();

       // obj.isLeapYear(year);
        System.out.println("Enter Month");
        month = input.nextInt();


        System.out.println("Enter Year:");
        year = input.nextInt();
        obj.isLeapYear(year);
        getDaysInMonth(month,year);

    }
}
