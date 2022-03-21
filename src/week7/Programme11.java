package week7;

import java.util.Scanner;

public class Programme11 {


    public static void main(String[] args) {
         int i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter input 1 And it will show 1 to 100 numbers divided by 3 and 5 respectively");
        i = s.nextInt();

       for( int a=i; a<=100; a++){
           if(a%3==0){
           System.out.println("Number is divided by 3: " +a); }
       }
        for( int a=i; a<=100; a++){
            if(a%5==0){
                System.out.println("Number is divided by 5: " +a); }
        }


    }
}
