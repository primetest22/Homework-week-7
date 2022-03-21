package week7;

import java.util.Scanner;

//Write a java program that tells us that Input number is odd or even?
//HINT: use ternary operator (? :)
public class Programme1 {

    public void oddOrEven(){
        int a;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter input: ");
        a = input.nextInt();

        String result = (a % 2 ==0)? "Even" : "odd";
        System.out.println("This is number is: " + result);

    }


    public static void main(String[] args) {
    Programme1 obj = new Programme1();
    obj.oddOrEven();
    }

}
