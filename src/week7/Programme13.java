package week7;

import java.util.Scanner;

public class Programme13 {

    void tellMeDay(int a){

        switch (a){
            case 1:
                System.out.println("Today Is Monday");
                break;
            case 2:
                System.out.println("Today Is Tuesday");
                break;
            case 3:
                System.out.println("Today Is Wednesday");
                break;
            case 4:
                System.out.println("Today Is Thursday");
                break;
            case 5:
                System.out.println("Today Is Friday");
                break;
            case 6:
                System.out.println("Today Is Saturday");
                break;
            case 7:
                System.out.println("Today Is Sunday");
                break;
            default:
                System.out.println("Enter valid number");
        }
    }

    public static void main(String[] args) {

        Programme13 obj = new Programme13();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number between 1 to 7:");
        int b = s.nextInt();


        obj.tellMeDay(b);
    }
}
