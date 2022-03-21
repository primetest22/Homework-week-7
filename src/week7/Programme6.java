package week7;

import java.util.Scanner;

public class Programme6 {
    int a;

    void oddEven(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");

        a= s.nextInt();
        if(a % 2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd"); }
        }

    public static void main(String[] args) {
        new Programme6().oddEven();

    }
}
